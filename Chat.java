
package client;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
public class Chat extends JFrame{
	static Chat es;
	public Chat() {
	        Chat1();
	    }

	    public final void Chat1() {
	    	JLabel receive,sent, contacts;
	    	 JTextArea receive1;
	    	 JTextArea sent1;
	    	 JTextArea contacts1;
	    	 JTextArea send1;
	    	 
	     
	       JPanel panel = new JPanel();
	       getContentPane().add(panel);

	       panel.setLayout(null);

	       
	       JButton signIn = new JButton("Disconnect");
	       signIn.setBounds(600,700, 200,50);
	       JButton changePass = new JButton("changePassword");
	       changePass.setBounds(400,650, 200,50);
	       JButton Send = new JButton("Send");
	       Send.setBounds(400,700, 200,50);
	       send1= new JTextArea();
	       send1.setBounds(100,700,300,50);
	       sent = new JLabel("Sent");
	       sent.setBounds(75,100,200,30);
	       receive=new JLabel("Received");
	       receive.setBounds(75,275,200,100);
	       receive1 = new JTextArea();
	       receive1.setBounds(150, 300, 300, 200);
	       contacts=new JLabel("Contact List");
	       contacts.setBounds(675,0,100,100);
	       contacts1=new JTextArea();
	      contacts1.setBounds(650, 100, 125, 400);
	       sent1= new JTextArea();
	       sent1.setBounds(150,100,300,190);
	       panel.add(changePass);
	       panel.add(sent);
	       panel.add(sent1);
	       panel.add(receive);
	       panel.add(contacts);
	       panel.add(contacts1);
	       panel.add(receive1);
	      panel.add(Send);
	       panel.add(signIn);
	       panel.add(send1);
	       

	       setTitle("Chat");
	       setSize(800, 800);
	       setLocationRelativeTo(null);
	       setDefaultCloseOperation(EXIT_ON_CLOSE);
	       signIn.addActionListener(new ActionListener() {
	    	    public void actionPerformed(ActionEvent e) {
	    	    	 // Login1.ex = new Login1();
	   	           connect.es.setVisible(true);
	   	           es.setVisible(false);
	   	          
	    	    }
	    	  });
	       changePass.addActionListener(new ActionListener() {
	    	    public void actionPerformed(ActionEvent e) {
	    	    	  
	   	           changePassword.es.setVisible(true);
	   	           es.setVisible(false);
	    	    }
	    	  });
	    }

	    public static void main(String[] args) {
	      
	           Chat ex = new Chat();
	           ex.setVisible(true);
	       
	    }

	


}

