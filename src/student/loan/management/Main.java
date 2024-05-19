package student.loan.management;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static java.lang.System.exit;

/**
 *
 * @author huzaifa
 */
public class Main extends JFrame implements ActionListener{
    
    
    JButton apply, pinchange, statement, exit1, give_back;
    String mail;
    Main(String mail) {
        setTitle("STUDENT ACCOUNT");
        setLayout(null);
        
        this.mail = mail;
        
        System.out.println("MMSSMM: " + mail);
        System.out.println("MMSSMM ORZ: " + this.mail);
        
        JLabel text = new JLabel("Welcome"); // first text
        text.setFont(new Font("Osward", Font.BOLD, 20));
        text.setBounds(200, 80, 150, 40);
        add(text);
        
        
        
        apply = new JButton("Apply For Loan");
        apply.setBounds(150, 150, 200, 30);
        apply.setBackground(Color.BLACK);
        apply.setForeground(Color.WHITE);  
        apply.addActionListener(this);
        add(apply);
        
        pinchange = new JButton("Change Password");
        pinchange.setBounds(150, 200, 200, 30);
        pinchange.setBackground(Color.BLACK);
        pinchange.setForeground(Color.WHITE);  
        pinchange.addActionListener(this);
        add(pinchange);
        
        statement = new JButton("Statement");
        statement.setBounds(150, 250, 200, 30);
        statement.setBackground(Color.BLACK);
        statement.setForeground(Color.WHITE);  
        statement.addActionListener(this);
        add(statement);
        
        give_back = new JButton("Repayment");
        give_back.setBounds(150, 300, 200, 30);
        give_back.setBackground(Color.BLACK);
        give_back.setForeground(Color.WHITE);  
        give_back.addActionListener(this);
        add(give_back);
        
        exit1 = new JButton("Exit");
        exit1.setBounds(150, 350, 200, 30);
        exit1.setBackground(Color.BLACK);
        exit1.setForeground(Color.WHITE);  
        exit1.addActionListener(this);
        add(exit1);
        
        
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(500, 450);
        setVisible(true);
        setLocation(350, 200);
    }
    
    public void actionPerformed(ActionEvent ae) {
        // Nothing to do
        // Just to @override 
        if (ae.getSource() == pinchange) {
            setVisible(false);
            new pinchange(mail).setVisible(true);
        }
        else if (ae.getSource() == apply) {
            setVisible(false);
            new loan(mail).setVisible(true);
        }
        else if (ae.getSource() == give_back) {
            
            System.out.println("HZ: " + mail);
            setVisible(false);
            new return1(mail).setVisible(true);
        }
        else if (ae.getSource() == statement) {
            setVisible(false);
            new balance(mail).setVisible(true);
        }
        else if (ae.getSource() == exit1) {
//            setVisible(false);
//            new Login().setVisible(true);
              exit(0);
        }
    }
    public static void main(String args[]) {
        new Main("");
    }
    
}
