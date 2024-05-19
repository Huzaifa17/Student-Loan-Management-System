package student.loan.management;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.math.BigInteger;
import java.util.*;

        
/**
 *
 * @author huzaifa
 */


public class return1 extends JFrame implements ActionListener {
    
    JTextField amount;
    JButton giveback, back;
    String mail;
    return1 (String mail) {
        
        
        setLayout(null);
        
        this.mail = mail;
        
        System.out.println("MMM: " + mail);
        
        JLabel text2 = new JLabel("Repayment"); // first text
        text2.setFont(new Font("Osward", Font.BOLD, 20));
        text2.setBounds(350, 30, 450, 20);
        add(text2);
        
        JLabel text = new JLabel("Enter the amount you want to return : "); // first text
        text.setFont(new Font("Osward", Font.BOLD, 20));
        text.setBounds(50, 90, 450, 20);
        add(text);
        
        amount = new JTextField();
        amount.setBounds(510, 90, 120, 25);
        amount.setFont(new Font("Arial", Font.BOLD, 20));
        add(amount);
        
        giveback = new JButton("CONFIRM");
        giveback.setBounds(480, 150, 115, 30);
        giveback.setBackground(Color.BLACK);
        giveback.setForeground(Color.WHITE);  
        giveback.addActionListener(this);
        add(giveback);
        
        back = new JButton("BACK");
        back.setBounds(280, 150, 115, 30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);  
        back.addActionListener(this);
        add(back);
        
        getContentPane().setBackground(Color.WHITE);
       
        setSize(900, 250);
        setLocation(420, 300);
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == back) {
            setVisible(false);
            new Main(mail).setVisible(true);
        }
        else if (ae.getSource() == giveback) {
            String value = amount.getText();
            Date date = new Date();
            BigInteger num = new BigInteger(value);
            String l = "1", r = "20000";
            BigInteger l1 = new BigInteger(l);
            BigInteger r1 = new BigInteger(r);
            
            System.out.println("mail: " + mail + " l1: " + l1 + " r1: " + r1 + " num: " + num);
            
            if (l1.compareTo(num) == 1 || r1.compareTo(num) == -1) {
                JOptionPane.showMessageDialog(null, "Please input correct amount");
            }
            else {
                try {
                    connected conn = new connected();
                    System.out.println("mail: " + mail);
                    String query = "insert into bank values('"+mail+"', '"+date+"', 'deposit', '"+value+"')";
                    conn.s.executeUpdate(query);
                    JOptionPane.showMessageDialog(null, "Taka " + value + " returned successfully");
                    setVisible(false);
                    new Main(mail).setVisible(true);
                } 
                catch(Exception e) {
                    System.out.println(e);
                }
            }
        }
    }
    
    public static void main(String args[]) {
        new return1("");
    }
}
