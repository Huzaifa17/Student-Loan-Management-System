package student.loan.management;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

/**
 *
 * @author huzaifa
 */

public class balance extends JFrame implements ActionListener {

    String mail;
    JButton fine;
    balance(String mail) {
        setLayout(null);
        
        this.mail = mail;
        
        
        JLabel statement = new JLabel("Transactions");
        statement.setFont(new Font("Raleway", Font.BOLD, 20));
        statement.setBounds(250, 40, 300, 40);
        add(statement);
        
        
        JLabel bal = new JLabel();
        bal.setFont(new Font("Raleway", Font.BOLD, 18));
        bal.setBounds(190, 300, 400, 40);
        add(bal);
        
        
        JLabel edit = new JLabel();
        edit.setFont(new Font("Raleway", Font.BOLD, 15));
        edit.setBounds(120, 50, 500, 200);
        add(edit);
        
        connected conn = new connected();
        try {
            ResultSet r = conn.s.executeQuery("select * from bank where mail = '"+mail+"'");
            int b = 0;
            while (r.next()) {
                if (r.getString("type").equals("deposit")) {
                    b += Integer.parseInt(r.getString("amount"));
                } else {
                    b -= Integer.parseInt(r.getString("amount"));
                }
            }
            bal.setText("Current Balance: " + b);
        } catch (Exception e) {
            System.out.println(e);
        }
        
        try {
            ResultSet r = conn.s.executeQuery("select * from bank where mail = '"+mail+"'");

            while (r.next()) {
                edit.setText(edit.getText() + "<html>" + r.getString("date") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + r.getString("type") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + r.getString("amount") + "<br><br><html>");
            }
            //edit.setText("Date: " + r.getString("date") + " ");
        } catch (Exception e) {
            System.out.println(e);
        }
        
        fine = new JButton("Ok");
        fine.setBounds(265, 350, 115, 30);
        fine.setBackground(Color.BLACK);
        fine.setForeground(Color.WHITE);  
        fine.addActionListener(this);
        add(fine);
        
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(650, 460);
        setVisible(true);
        setLocation(350, 200);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == fine) {
            System.out.println("HHHH: " + mail);
            setVisible(false);
            new Main(mail).setVisible(true);
        }
    }
    
    public static void main(String args[]) {
        new balance("");
    }
}
