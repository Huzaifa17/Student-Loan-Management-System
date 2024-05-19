package student.loan.management;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


/**
 *
 * @author huzaifa
 */

public class pinchange extends JFrame implements ActionListener{
    String mail;
    JButton change, back;
    JTextField p_new, pr_new;
    
    pinchange(String mail) {
        this.mail = mail;
        setLayout(null);
        
        JLabel text = new JLabel("Password Change"); // first text
        text.setFont(new Font("Osward", Font.BOLD, 28));
        text.setBounds(280, 60, 400, 40);
        add(text);
        
        JLabel pin = new JLabel("Enter New Password: "); // pin
        pin.setFont(new Font("Osward", Font.BOLD, 20));
        pin.setBounds(150, 140, 400, 40);
        add(pin);
        
        p_new = new JTextField();
        p_new.setBounds(400, 150, 200, 25);
        p_new.setFont(new Font("Osward", Font.BOLD, 14));
        add(p_new);
        
        JLabel rpin = new JLabel("Re-Enter New Password: "); // pin
        rpin.setFont(new Font("Osward", Font.BOLD, 20));
        rpin.setBounds(113, 190, 400, 40);
        add(rpin);
        
        pr_new = new JTextField();
        pr_new.setBounds(400, 200, 200, 25);
        pr_new.setFont(new Font("Oswardl", Font.BOLD, 14));
        add(pr_new);
        
        change = new JButton("Change");
        change.setBounds(450, 280, 135, 30);
        change.setBackground(Color.BLACK);
        change.setForeground(Color.WHITE);  
        change.addActionListener(this);
        add(change);
        
        back = new JButton("Back");
        back.setBounds(250, 280, 135, 30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);  
        back.addActionListener(this);
        add(back);
        
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(850, 400);
        setVisible(true);
        setLocation(350, 200);
    }
    
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == change) {
            try {
                String npin = p_new.getText();
                String rnpin = pr_new.getText();
                
                if (npin.equals("")) {
                    JOptionPane.showMessageDialog(null, "Please Enter New Password");
                    return ;
                }
                
                if (rnpin.equals("")) {
                    JOptionPane.showMessageDialog(null, "Please Re-Enter New Password");
                    return ;
                }
                
                if (!npin.equals(rnpin)) {
                    JOptionPane.showMessageDialog(null, "Entered Password does not match");
                    return ;
                }
                
                connected conn = new connected();
                String query1 = "update id set pinnumber = '"+npin+"' where mail = '"+mail+"'";
                String query2 = "update create_account1 set pinnumber = '"+npin+"' where mail = '"+mail+"'";
                
                conn.s.executeUpdate(query1);
                conn.s.executeUpdate(query2);
                
                JOptionPane.showMessageDialog(null, "Password changed Successfully");
                
                setVisible(false);
                new Main(mail).setVisible(true);
            }
            catch (Exception e) {
                System.out.println(e);
            }
        }
        else if (ae.getSource() == back) {
                setVisible(false);
                new Main(mail).setVisible(true);
        }
    }
    
    public static void main (String args[]) {
        new pinchange("");
    }
}
