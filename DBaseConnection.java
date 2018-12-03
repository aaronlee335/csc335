package Database;

//-- download MySQL from: http://dev.mysql.com/downloads/
//Community Server version
//-- Installation instructions are here: http://dev.mysql.com/doc/refman/5.7/en/installing.html
//-- open MySQL Workbench to see the contents of the database
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

//-- MAKE SURE THE JDBC CONNECTOR JAR IS IN THE BUILD PATH
//workspace -> properties -> Java Build Path -> Libraries -> Add External JARs...
//-- C:\Program Files (x86)\MySQL\Connector J 5.1.26\mysql-connector-java-5.1.26-bin.jar
public class DBaseConnection {

// -- objects to be used for database access
private Connection conn = null;
private Statement stmt = null;
private ResultSet rset = null;

// -- connect to the world database
// -- this is the connector to the database, default port is 3306
//private String url = "jdbc:mysql://localhost:3306/world";
private String url = "jdbc:mysql://127.0.0.1:3306/userDB";

// -- this is the username/password, created during installation and in MySQL Workbench
//    When you add a user make sure you give them the appropriate Administrative Roles
//    (DBA sets all which works fine)
private String user = "root";
private String password = "LanBr!18b";

public DBaseConnection() {
	try {
      // -- make the connection to the database
		conn = DriverManager.getConnection(url, user, password);
      
		// -- These will be used to send queries to the database
      stmt = conn.createStatement();
      rset = stmt.executeQuery("SELECT VERSION()");
      if (rset.next()) {
          System.out.println(rset.getString(1));
      }
      // -- retrieve record(s) from database
      String command = "SELECT * FROM users;";
      // -- a query will return a ResultSet
      // -- city is a table within the world database
      rset = stmt.executeQuery(command);
      
      // -- the metadata tells us how many columns in the data
      ResultSetMetaData rsmd = rset.getMetaData();
      int numberOfColumns = rsmd.getColumnCount();
      System.out.println("columns: " + numberOfColumns);
      
      // -- loop through the ResultSet one row at a time
      //    Note that the ResultSet starts at index 1
      while (rset.next()) {
      	// -- loop through the columns of the ResultSet
      	for (int i = 1; i < numberOfColumns; ++i) {
      		System.out.print(rset.getString(i) + "\t\t");
      	}
      	System.out.println(rset.getString(numberOfColumns));
      }

	} catch (SQLException ex) {
		// handle any errors
		System.out.println("SQLException: " + ex.getMessage());
		System.out.println("SQLState: " + ex.getSQLState());
		System.out.println("VendorError: " + ex.getErrorCode());
	}

}

/**
* @param args
*/
public static void main(String[] args) {

	DBaseConnection dbc = new DBaseConnection();
	dbc.createUser("aaron", "aaron123", "aaron@aaron.lee", 0);
	dbc.changePassword("aaron", "123aaron");
	dbc.checkLoginInfo ("aaron", "123aaron");
}
public void createUser(String username, String pass, String email, int status) {
	String insert = "insert ignore into Users (Username, Password, Email, Status) values ('" + username + "', '" + pass + "', '" + email + "', '" + status +"');";
	System.out.println(insert);
	try {
		stmt.executeUpdate(insert);
		
	} catch (SQLException e) {
		e.printStackTrace();
	}
}

public void changePassword(String username, String newPass) {
	String update = "update Users set" + "Password ='" 
			+ newPass + "' where Username ='" + username + "';";
	System.out.println(update);
	try {
		stmt.executeUpdate(update);
		
	} catch (SQLException e) {
		e.printStackTrace();
	}
}

public boolean checkLoginInfo(String username, String pass) {
	String query = "select * from Users where Username = '" + username +
			"' and Password = '" + pass + "';";
	System.out.println(query);
	try {
		ResultSet rs = stmt.executeQuery(query);
		if(rs.wasNull()) {
			return false;
		}
		else {
			return true;
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return false;
}
}
