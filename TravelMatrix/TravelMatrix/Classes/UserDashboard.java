package Classes;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class UserDashboard implements ActionListener
{
    
    
    private JFrame userDashF;
    private Image iconFrame;
    private JButton back;



    public UserDashboard()
    {
        iconFrame = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Image/TravelMatrixApp.png"));
        userDashF = new JFrame();


        back = new JButton("Login Page");
        back.setBounds(50,600,250,50);
        back.setFont(new  Font("Poppins", Font.BOLD,20));
        back.setCursor(new Cursor(Cursor.HAND_CURSOR));
        back.setBackground(new Color(51,61,84));
        back.setFocusable(false);
        back.setBorderPainted(false);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);

        userDashF.add(back);

        userDashF.setLayout(null);
        userDashF.setTitle("Travel Matrix | UserDashboard");
        userDashF.setSize(1260, 700);
        userDashF.setIconImage(iconFrame);
        userDashF.setVisible(true);
        userDashF.setResizable(false);
        userDashF.setLocationRelativeTo(null);
        userDashF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource()==back)
        {
            userDashF.dispose();
            new Login();
        }
    }
}
