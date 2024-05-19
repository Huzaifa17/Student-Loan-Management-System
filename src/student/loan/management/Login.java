package student.loan.management;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

/**
 *
 * @author huzaifa
 */

public class Login extends JFrame implements ActionListener {
    JTextField InputID;
    JPasswordField InputPIN;
    JButton clearall, loginaccount, createaccount;
    
    Login() {
        setTitle("STUDENT ACCOUNT");
        setLayout(null);
        
        ImageIcon il = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        // JLabel label = new JLabel(il);
        Image i2 = il.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(360, 30, 100, 100);
        add(label);
        
        JLabel text = new JLabel("MBSTU"); // first text
        text.setFont(new Font("Osward", Font.BOLD, 38));
        text.setBounds(340, 130, 400, 40);
        add(text);
        
        JLabel loan = new JLabel("Student Loan Management System"); // second text student loan
        loan.setFont(new Font("Osward", Font.BOLD, 38));
        loan.setBounds(50, 180, 780, 45);
        add(loan);
        
        JLabel id = new JLabel("Student Email:"); // third text id
        id.setFont(new Font("Osward", Font.BOLD, 25));
        id.setBounds(118, 250, 300, 40);
        add(id);
        
        // input into id
        InputID = new JTextField();
        InputID.setBounds(340, 260, 200, 25);
        InputID.setFont(new Font("Arial", Font.BOLD, 14));
        add(InputID);
        
        JLabel pin = new JLabel("Password:"); // fourth text password
        pin.setFont(new Font("Osward", Font.BOLD, 25));
        pin.setBounds(183, 280, 300, 40);
        add(pin);
        
        // input into pin
        InputPIN = new JPasswordField();
        InputPIN.setBounds(340, 290, 200, 25);
        InputPIN.setFont(new Font("Arial", Font.BOLD, 14));
        add(InputPIN);
        
        // clearall
        clearall = new JButton("Clear");
        clearall.setBounds(300, 330, 115, 30);
        clearall.setBackground(Color.BLACK);
        clearall.setForeground(Color.WHITE);  
        clearall.addActionListener(this);
        add(clearall);
        
        // login account
        loginaccount = new JButton("Login");
        loginaccount.setBounds(450, 330, 115, 30);
        loginaccount.setBackground(Color.BLACK);
        loginaccount.setForeground(Color.WHITE); 
        loginaccount.addActionListener(this);
        add(loginaccount);
        
        // create account
        createaccount = new JButton("Create Account");
        createaccount.setBounds(370, 370, 145, 30);
        createaccount.setBackground(Color.BLACK);
        createaccount.setForeground(Color.WHITE);  
        createaccount.addActionListener(this);
        add(createaccount);
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(850, 500);
        setVisible(true);
        setLocation(350, 200);
    }
    
    public void actionPerformed(ActionEvent ae) {
        // Nothing to do
        // Just to @override 
        
        String mail = InputID.getText();
        String pass = InputPIN.getText();
        //System.out.println("pass: " + pass);
        if (ae.getSource() == clearall) {
            InputID.setText("");
            InputPIN.setText("");
        }
        else if (ae.getSource() == loginaccount) {
            connected conn = new connected();
            try {
                int ok = 0;
                ResultSet r = conn.s.executeQuery("select * from id");
                while (r.next()) {
                    if (r.getString("mail").equals(mail) && r.getString("pinnumber").equals(pass)) {
                        ok = 1;
                        // System.out.println("mail LOGIN: " + mail);
                        setVisible(false);
                        new Main(mail).setVisible(true);
                    }
                }
                if (ok == 0) {
                    JOptionPane.showMessageDialog(null, "Invalid Input");
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        else if (ae.getSource() == createaccount) {
            setVisible(false);
            new create_account1().setVisible(true);
        }
    }
    public static void main(String args[]) {
        new Login();
    }
}

