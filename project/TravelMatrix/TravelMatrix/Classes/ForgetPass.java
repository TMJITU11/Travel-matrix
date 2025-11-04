package Classes;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ForgetPass implements ActionListener
{
    
    
    private JFrame frgtPassF;
    private Image iconFrame;
    private JButton back;



    public ForgetPass()
    {
        iconFrame = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Image/TravelMatrixApp.png"));
        frgtPassF = new JFrame();

        back = new JButton("Login Page");
        back.setBounds(50,600,250,50);
        back.setFont(new  Font("Poppins", Font.BOLD,20));
        back.setCursor(new Cursor(Cursor.HAND_CURSOR));
        back.setBackground(new Color(51,61,84));
        back.setFocusable(false);
        back.setBorderPainted(false);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);


        frgtPassF.add(back);

        frgtPassF.setLayout(null);
        frgtPassF.setTitle("Travel Matrix | Password Recovery");
        frgtPassF.setSize(1260, 700);
        frgtPassF.setIconImage(iconFrame);
        frgtPassF.setVisible(true);
        frgtPassF.setResizable(false);
        frgtPassF.setLocationRelativeTo(null);
        frgtPassF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource()==back)
        {
            frgtPassF.dispose();
            new Login();
        }
    }
    
}
