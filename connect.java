package client;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class connect extends JFrame {
	static connect es;
	static JTextField IP;
	public connect() {
		connect1();
	}
	public void connect1() {
	JLabel l2;
	 
  JPanel panel = new JPanel();
  getContentPane().add(panel);

  panel.setLayout(null);

  
  JButton signIn = new JButton("connect");
  signIn.setBounds(150, 300, 150, 30);
  l2 = new JLabel("IP Adress");
  l2.setBounds(75,100,200,30);
  
  IP = new JTextField();
  IP.setBounds(150, 100, 200, 30);
 
 
  
  panel.add(l2);
  
  panel.add(IP);
  
  panel.add(signIn);
  

  setTitle("connect");
  setSize(350, 350);
  setLocationRelativeTo(null);
  setDefaultCloseOperation(EXIT_ON_CLOSE);
  signIn.addActionListener(new ActionListener() {
	   // connect is pressed will check field for values  
	    public void actionPerformed(ActionEvent e) {
	    	if(!IP.getText().isEmpty()) {
	    	Client.main();
	    	if(Client.falsetrue==true) {
	    		
	           Login1.ex.setVisible(true);
	           es.setVisible(false);
	           
	    	}}
	    }
	    
	  });
}
	public static void main(String[] args) {
		 es = new connect();
         es.setVisible(true);
         newUser2.es = new newUser2();
         newUser2.es.setVisible(false);
         passwordRecovery.ea = new passwordRecovery();
         passwordRecovery.ea.setVisible(false);
         Chat.es = new Chat();
         Chat.es.setVisible(false);
         Login1.ex = new Login1();
         Login1.ex.setVisible(false);
         changePassword.es = new changePassword();
         changePassword.es.setVisible(false);
	}
}