package client;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
public class Login1 extends JFrame{
	 static Login1 ex;  
	public Login1() {
	        login();
	    }

	    @SuppressWarnings("deprecation")
		public  void login() {
	    	JLabel l2, l3;
	    	 JTextField tf1;
	    	 JPasswordField p1;
	       JPanel panel = new JPanel();
	       getContentPane().add(panel);

	       panel.setLayout(null);

	       JButton newUser = new JButton("New User");
	       newUser.setBounds(50, 250, 100, 30);
	       JButton forgotPassword = new JButton("Forgot Password");
	       forgotPassword.setBounds(150, 250, 150, 30);
	       JButton signIn = new JButton("Sign In");
	       signIn.setBounds(150, 300, 150, 30);
	       l2 = new JLabel("Username");
	       l2.setBounds(75,100,200,30);
	       l3 = new JLabel("Password");
	       l3.setBounds(75,150,200,30);
	       tf1 = new JTextField();
	       tf1.setBounds(150, 100, 200, 30);
	       p1 = new JPasswordField();
	       p1.setBounds(150, 150, 200, 30);
	       panel.add(l2);
	       panel.add(l3);
	       panel.add(tf1);
	       panel.add(p1);
	       panel.add(signIn);
	       panel.add(forgotPassword);
	       panel.add(newUser);
	       
	   setTitle("Login");
	       setSize(350, 350);
	       setLocationRelativeTo(null);
	       setDefaultCloseOperation(EXIT_ON_CLOSE);
	       newUser.addActionListener(new ActionListener() {
	    	    public void actionPerformed(ActionEvent e) {
	    	    
	   	           newUser2.es.setVisible(true);
	   	  
	   	         closeOpen(ex, false);
	   	           
	    	    }
	    	  });
	       forgotPassword.addActionListener(new ActionListener() {
	    	    public void actionPerformed(ActionEvent e) {
	    	    	  
	   	           passwordRecovery.ea.setVisible(true);
	   	           closeOpen(ex,false);
	    	    }
	    	  });

	       signIn.addActionListener(new ActionListener() {
	    	   
	    	    public void actionPerformed(ActionEvent e) {
	    	    	if(!tf1.getText().isEmpty()&&p1.getPassword().length>0) {
	    	    	
	   	           Chat.es.setVisible(true);
	   	           closeOpen(ex, false);
	    	    	}
	   	        
	    	    }
	    	  });
	    }
		   public static void closeOpen(JFrame frame,boolean trueFalse) {
			      
	           
	           frame.setVisible(trueFalse);
	           
	       
		   }
		  
		
	 


	

}