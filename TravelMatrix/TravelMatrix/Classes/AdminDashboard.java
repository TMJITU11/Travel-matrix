package Classes;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class AdminDashboard implements ActionListener
{
    
    
    private JFrame admindashF;
    
    private JButton logoutB;
    private JButton adduser,removeuser,searchuser,edituser,showAlluser;
    private JButton addTRPack, removeTRPack, editTRPack, showTRPack,searchTRPack;
    private  JTabbedPane adminPane;
    private Image iconFrame;
    private  JLabel userLabel,bookLabel,tripLabel;
    private  JPanel userPanel,bookingPanel,tripPanel;
    private ImageIcon userBg,bookingbg,tripbg,userIcon,tripIcon,bookIcon;


    public AdminDashboard()
    {
        iconFrame = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Image/TravelMatrixApp.png"));
        
        //tabbedpane icon
        userIcon = new ImageIcon(new ImageIcon("image/usericon.png").getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH));
        tripIcon = new ImageIcon(new ImageIcon("image/tripicon.png").getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH));
        bookIcon = new ImageIcon(new ImageIcon("image/bookicon.png").getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH));
        
        //pane img
        userBg = new ImageIcon(new ImageIcon("image/userMana.png").getImage().getScaledInstance(890, 660, Image.SCALE_SMOOTH));
        bookingbg = new ImageIcon(new ImageIcon("image/bookingmana.png").getImage().getScaledInstance(890, 660, Image.SCALE_SMOOTH));
        tripbg = new ImageIcon(new ImageIcon("image/tripmana.png").getImage().getScaledInstance(890, 660, Image.SCALE_SMOOTH));


        admindashF = new JFrame();

        //userMana
        adminPane = new JTabbedPane();
        adminPane.setTabPlacement(JTabbedPane.LEFT);
        adminPane.setFont(new Font("Poppins",Font.PLAIN,25));
        adminPane.setBackground(new Color(51,61,84));
        adminPane.setForeground(Color.WHITE);

        logoutB = new JButton("Logout");
        logoutB.setBounds(50,600,250,50);
        logoutB.setFont(new  Font("Poppins", Font.BOLD,20));
        logoutB.setCursor(new Cursor(Cursor.HAND_CURSOR));
        logoutB.setBackground(new Color(51,61,84));
        logoutB.setFocusable(false);
        logoutB.setBorderPainted(false);
        logoutB.setForeground(Color.WHITE);
        logoutB.addActionListener(this);
        
        adduser = new JButton("Add New User");
        adduser.setBounds(600,100,250,50);
        adduser.setFont(new  Font("Poppins", Font.BOLD,20));
        adduser.setCursor(new Cursor(Cursor.HAND_CURSOR));
        adduser.setBackground(Color.white);
        adduser.setFocusable(false);
        adduser.setBorderPainted(false);
        adduser.setForeground(new Color(51,61,84));
        adduser.addActionListener(this);
        

        edituser = new JButton("Edit User");
        edituser.setBounds(600,170,250,50);
        edituser.setFont(new  Font("Poppins", Font.BOLD,20));
        edituser.setCursor(new Cursor(Cursor.HAND_CURSOR));
        edituser.setBackground(Color.white);
        edituser.setFocusable(false);
        edituser.setBorderPainted(false);
        edituser.setForeground(new Color(51,61,84));
        edituser.addActionListener(this);



        searchuser = new JButton("Search User");
        searchuser.setBounds(600,240,250,50);
        searchuser.setFont(new  Font("Poppins", Font.BOLD,20));
        searchuser.setCursor(new Cursor(Cursor.HAND_CURSOR));
        searchuser.setBackground(Color.white);
        searchuser.setFocusable(false);
        searchuser.setBorderPainted(false);
        searchuser.setForeground(new Color(51,61,84));
        searchuser.addActionListener(this);

        removeuser = new JButton("Remove User");
        removeuser.setBounds(600,310,250,50);
        removeuser.setFont(new  Font("Poppins", Font.BOLD,20));
        removeuser.setCursor(new Cursor(Cursor.HAND_CURSOR));
        removeuser.setBackground(Color.white);
        removeuser.setFocusable(false);
        removeuser.setBorderPainted(false);
        removeuser.setForeground(new Color(51,61,84));
        removeuser.addActionListener(this);

        showAlluser = new JButton("Show Users");
        showAlluser.setBounds(600,380,250,50);
        showAlluser.setFont(new  Font("Poppins", Font.BOLD,20));
        showAlluser.setCursor(new Cursor(Cursor.HAND_CURSOR));
        showAlluser.setBackground(Color.white);
        showAlluser.setFocusable(false);
        showAlluser.setBorderPainted(false);
        showAlluser.setForeground(new Color(51,61,84));
        showAlluser.addActionListener(this);

        userPanel = new JPanel();
        userLabel = new JLabel(userBg);
        userLabel.setBounds(0, 0, 890, 660);
        userPanel.add(userLabel);
        userLabel.add(adduser);
        userLabel.add(edituser);
        userLabel.add(removeuser);
        userLabel.add(searchuser);
        userLabel.add(showAlluser);

        //booking managment

        bookingPanel = new JPanel();
        bookLabel = new JLabel(bookingbg);
        bookLabel.setBounds(0, 0, 890, 660);
        bookingPanel.add(bookLabel);


        //trip managment
        addTRPack = new JButton("Add New Package");
        addTRPack.setBounds(50,120,250,50);
        addTRPack.setFont(new  Font("Poppins", Font.BOLD,20));
        addTRPack.setCursor(new Cursor(Cursor.HAND_CURSOR));
        addTRPack.setBackground(Color.white);
        addTRPack.setFocusable(false);
        addTRPack.setBorderPainted(false);
        addTRPack.setForeground(new Color(51,61,84));
        addTRPack.addActionListener(this);


        editTRPack = new JButton("Edit Package");
        editTRPack.setBounds(320,120,250,50);
        editTRPack.setFont(new  Font("Poppins", Font.BOLD,20));
        editTRPack.setCursor(new Cursor(Cursor.HAND_CURSOR));
        editTRPack.setBackground(Color.white);
        editTRPack.setFocusable(false);
        editTRPack.setBorderPainted(false);
        editTRPack.setForeground(new Color(51,61,84));
        editTRPack.addActionListener(this);



        searchTRPack = new JButton("Search Package");
        searchTRPack.setBounds(590,120,250,50);
        searchTRPack.setFont(new  Font("Poppins", Font.BOLD,20));
        searchTRPack.setCursor(new Cursor(Cursor.HAND_CURSOR));
        searchTRPack.setBackground(Color.white);
        searchTRPack.setFocusable(false);
        searchTRPack.setBorderPainted(false);
        searchTRPack.setForeground(new Color(51,61,84));
        searchTRPack.addActionListener(this);

        removeTRPack = new JButton("Remove Package");
        removeTRPack.setBounds(175,190,250,50);
        removeTRPack.setFont(new  Font("Poppins", Font.BOLD,20));
        removeTRPack.setCursor(new Cursor(Cursor.HAND_CURSOR));
        removeTRPack.setBackground(Color.white);
        removeTRPack.setFocusable(false);
        removeTRPack.setBorderPainted(false);
        removeTRPack.setForeground(new Color(51,61,84));
        removeTRPack.addActionListener(this);

        showTRPack = new JButton("Show Packages");
        showTRPack.setBounds(445,190,250,50);
        showTRPack.setFont(new  Font("Poppins", Font.BOLD,20));
        showTRPack.setCursor(new Cursor(Cursor.HAND_CURSOR));
        showTRPack.setBackground(Color.white);
        showTRPack.setFocusable(false);
        showTRPack.setBorderPainted(false);
        showTRPack.setForeground(new Color(51,61,84));
        showTRPack.addActionListener(this);

        tripPanel = new JPanel();
        tripLabel = new JLabel(tripbg);
        tripPanel.add(tripLabel);
        tripLabel.setBounds(0, 0, 890, 660);
        tripLabel.add(addTRPack);
        tripLabel.add(editTRPack);
        tripLabel.add(removeTRPack);
        tripLabel.add(searchTRPack);
        tripLabel.add(showTRPack);







        adminPane.addTab("User Management",userIcon, userPanel);
        adminPane.addTab("Trip Management",tripIcon, tripPanel);
        adminPane.addTab("Booking Management",bookIcon, bookingPanel);
    
        admindashF.add(logoutB);
        admindashF.add(adminPane);


        // admindashF.setLayout(null);
        admindashF.setTitle("Travel Matrix | Admin Dashboard");
        admindashF.setSize(1260, 700);
        admindashF.setIconImage(iconFrame);
        admindashF.setVisible(true);
        admindashF.setResizable(false);
        admindashF.setLocationRelativeTo(null);
        admindashF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }   

    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource()==logoutB)
        {
            new Login();
            admindashF.dispose();
        }
    }
    

}
