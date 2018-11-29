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
public class passwordRecovery extends JFrame{
	static passwordRecovery ea; 
	public passwordRecovery() {
	        passwordRecovery1();
	    }

	    public final void passwordRecovery1() {
	    	JLabel l2;
	    	 JTextField tf1;
	       JPanel panel = new JPanel();
	       getContentPane().add(panel);

	       panel.setLayout(null);

	       
	       JButton signIn = new JButton("recover Password");
	       signIn.setBounds(150, 300, 150, 30);
	       l2 = new JLabel("Username");
	       l2.setBounds(75,100,200,30);
	       
	       tf1 = new JTextField();
	       tf1.setBounds(150, 100, 200, 30);
	      
	      
	       
	       panel.add(l2);
	       
	       panel.add(tf1);
	       
	       panel.add(signIn);
	       

	       setTitle("Recover Password");
	       setSize(350, 350);
	       setLocationRelativeTo(null);
	       setDefaultCloseOperation(EXIT_ON_CLOSE);
	       signIn.addActionListener(new ActionListener() {
	    	    public void actionPerformed(ActionEvent e) {
	    	      if(!tf1.getText().isEmpty()) { 
	    	    	//Login1.ex = new Login1();
	   	           
	   	           ea.setVisible(false);
	   	        Login1.ex.setVisible(true);
	    	    }
	    	    }
	    	  });
	    }

	    public static void main(String[] args) {
	      
	            ea = new passwordRecovery();
	           ea.setVisible(true);
	       
	    }

	


}
