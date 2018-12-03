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
public class newUser2 extends JFrame{
	static newUser2 es; 
	public newUser2() {
	        newUser1();
	    }

	    public final void newUser1() {
	    	JLabel l1,l2, l3;
	    	 JTextField tf1;
	    	 JTextField tf2;
	    	 JTextField p1;
	       JPanel panel = new JPanel();
	       getContentPane().add(panel);

	       panel.setLayout(null);

	       
	       JButton signIn = new JButton("Create User");
	       signIn.setBounds(150, 300, 150, 30);
	       l2 = new JLabel("Username");
	       l2.setBounds(75,100,200,30);
	       l3 = new JLabel("Password");
	       l3.setBounds(75,150,200,30);
	       l1=new JLabel("Email");
	       l1.setBounds(75,200,200,30);
	       tf1 = new JTextField();
	       tf1.setBounds(150, 100, 200, 30);
	       p1 = new JTextField();
	       p1.setBounds(150, 150, 200, 30);
	       tf2= new JTextField();
	       tf2.setBounds(150,200,200,30);
	       panel.add(l1);
	       panel.add(tf2);
	       panel.add(l2);
	       panel.add(l3);
	       panel.add(tf1);
	       panel.add(p1);
	       panel.add(signIn);
	       

	       setTitle("newUser");
	       setSize(350, 350);
	       setLocationRelativeTo(null);
	       setDefaultCloseOperation(EXIT_ON_CLOSE);
	       //Will create user
	       signIn.addActionListener(new ActionListener() {
	    	   
	    	    public void actionPerformed(ActionEvent e) {
	    	    //Login1.ex = new Login1();\
	    	    	if(!tf1.getText().isEmpty()&&!tf2.getText().isEmpty()&& !p1.getText().isEmpty())
	    	    	{
	    	    		System.out.println(RegTextHarness.validEmailAddress(tf2.getText()));
	    	    		
	    	    		if( RegTextHarness.validEmailAddress(tf2.getText())==true&&RegTextHarness.validPassword(p1.getText())==true) {
	   	           Login1.ex.setVisible(true);
	   	          es.setVisible(false);
	    	    }
	    	    		}
	    	    }
	    	  });
	    }

}
