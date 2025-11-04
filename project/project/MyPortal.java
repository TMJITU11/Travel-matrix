import java.lang.*;
import javax.swing.*;

public class MyPortal {
    private JFrame f;
    private JButton b1, b2;
    private JTextField t1;
    private JLabel l1, l2, background;
    private JPasswordField t2;
    private ImageIcon i;
	private JPanel boarder;
    
    public MyPortal() {
        f = new JFrame("TravelMatrix Portal");
         b1 = new JButton("Login");
        b2 = new JButton("Registration");        
        l1 = new JLabel("User Name :");
        l2 = new JLabel("Password :");        
        t1 = new JTextField();
        t2 = new JPasswordField(); 	
        i = new ImageIcon("bgg.jpg");
        background = new JLabel(); 
		background.setIcon(i);
		
		
        background.setBounds(0, 0, 1260, 700);

        l1.setBounds(650, 350, 100, 30); 
        t1.setBounds(740, 350, 200, 30);
        
        l2.setBounds(650, 400, 95, 30);  
        t2.setBounds(740, 400, 150, 30);
        
        b1.setBounds(650, 490, 110, 30);
		b2.setBounds(800,490,110,30);
		
        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(b1);
        f.add(b2);
        f.add(background);
       
        f.setSize(1260, 700);
        f.setLayout(null);
        f.setVisible(true);
    }
}