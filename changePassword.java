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
public class changePassword extends JFrame{
	static changePassword es; 
	public changePassword() {
	        changePassword1();
	    }

	    public final void changePassword1() {
	    	JLabel l2, l3;
	    	 JTextField tf1;
	    	
	    	 JPasswordField p1;
	       JPanel panel = new JPanel();
	       getContentPane().add(panel);

	       panel.setLayout(null);

	       
	       JButton signIn = new JButton("Change Password");
	       signIn.setBounds(150, 300, 150, 30);
	       l2 = new JLabel("New Password");
	       l2.setBounds(50,100,200,30);
	       l3 = new JLabel("Confirm Password");
	       l3.setBounds(25,150,200,30);
	       
	       tf1 = new JPasswordField();
	       tf1.setBounds(150, 100, 200, 30);
	       p1 = new JPasswordField();
	       p1.setBounds(150, 150, 200, 30);
	       
	      
	       panel.add(l2);
	       panel.add(l3);
	       panel.add(tf1);
	       panel.add(p1);
	       panel.add(signIn);
	       

	       setTitle("Change Password");
	       setSize(350, 350);
	       setLocationRelativeTo(null);
	       setDefaultCloseOperation(EXIT_ON_CLOSE);
	       signIn.addActionListener(new ActionListener() {
	    	    public void actionPerformed(ActionEvent e) {
	    	    if(p1.getPassword().length>0&&!tf1.getText().isEmpty()) {  
	   	           Chat.es.setVisible(true);
	   	           es.setVisible(false);
	    	    }
	    	    }
	    	  });
	    }

	    public static void main(String[] args) {
	      
	            es = new changePassword();
	           es.setVisible(true);
	       
	    }

	


}