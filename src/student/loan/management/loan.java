package student.loan.management;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static java.lang.System.exit;
import java.sql.*;
import java.util.*;

/**
 *
 * @author huzaifa
 */


public class loan extends JFrame implements ActionListener {
    String mail;
    JButton confirm, no;
    loan(String mail) {
        
        setLayout(null);
        
        this.mail = mail;
        
        JLabel statement = new JLabel("Are you sure you want to take loan ?");
        statement.setFont(new Font("Raleway", Font.BOLD, 20));
        statement.setBounds(120, 40, 600, 40);
        add(statement);
        
        confirm = new JButton("Yes");
        confirm.setBounds(180, 100, 100, 30);
        confirm.setBackground(Color.BLACK);
        confirm.setForeground(Color.WHITE);  
        confirm.addActionListener(this);
        add(confirm);
        
        no = new JButton("No");
        no.setBounds(350, 100, 100, 30);
        no.setBackground(Color.BLACK);
        no.setForeground(Color.WHITE);  
        no.addActionListener(this);
        add(no);
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(650, 200);
        setVisible(true);
        setLocation(350, 200);

        
        
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == confirm) {
            int b = 0;
            
            //connected conn2 = new connected();
            //connected conn3 = new connected();
            try {
                System.out.println("1");
                connected conn = new connected();
                ResultSet r = conn.s.executeQuery("select * from bank where mail = '"+mail+"'");
                while (r.next()) {
                    
                    System.out.println("type: " + r.getString("type") + " amount: " + r.getString("amount"));
                    if (r.getString("type").equals("deposit")) {
                        b += Integer.parseInt(r.getString("amount"));
                    } else {
                        b -= Integer.parseInt(r.getString("amount"));
                    }
                }
                if (b < 0) {
                    JOptionPane.showMessageDialog(null, "You have already taken loan and did not repay\nTherefore repay first");
                    setVisible(false);
                    new Main(mail).setVisible(true);
                    return ;
                }
                
                System.out.println("b: " + b);
            } catch (Exception e) {
                System.out.println(e);
            }

            try {
                System.out.println("2");
                connected conn2 = new connected();
                ResultSet r = conn2.s.executeQuery("select * from create_account1 where mail = '"+mail+"'");
                System.out.println("3");
                
                while (r.next()) {
                
                    String fmember = r.getString("familymember");
                    String earnings1 = r.getString("earnings");
                
                   //  System.out.println("familym: " + fmember + " earnings: " + earnings1);

                    if (fmember.equals(">= 8")) {
                        if (earnings1.equals("<= 100000")) {
                            String value = "20000";
                            java.util.Date date = new java.util.Date();
                            String query = "insert into bank values('"+mail+"', '"+date+"', 'loan', '"+value+"')";
                            conn2.s.executeUpdate(query);
                            JOptionPane.showMessageDialog(null, "Taka " + value + " loan given successfully");
                            setVisible(false);
                            new Main(mail).setVisible(true);
                        }
                        else if (earnings1.equals("<= 150000")) {
                            String value = "18000";
                            java.util.Date date = new java.util.Date();
                            String query = "insert into bank values('"+mail+"', '"+date+"', 'loan', '"+value+"')";
                            conn2.s.executeUpdate(query);
                            JOptionPane.showMessageDialog(null, "Taka " + value + " loan given successfully");
                            setVisible(false);
                            new Main(mail).setVisible(true);
                        }
                        else if (earnings1.equals("<= 200000")) {
                            String value = "16000";
                            java.util.Date date = new java.util.Date();
                            String query = "insert into bank values('"+mail+"', '"+date+"', 'loan', '"+value+"')";
                            conn2.s.executeUpdate(query);
                            JOptionPane.showMessageDialog(null, "Taka " + value + " loan given successfully");
                            setVisible(false);
                            new Main(mail).setVisible(true);
                        }
                        else if (earnings1.equals("<= 250000")) {
                            String value = "14000";
                            java.util.Date date = new java.util.Date();
                            String query = "insert into bank values('"+mail+"', '"+date+"', 'loan', '"+value+"')";
                            conn2.s.executeUpdate(query);
                            JOptionPane.showMessageDialog(null, "Taka " + value + " loan given successfully");
                            setVisible(false);
                            new Main(mail).setVisible(true);
                        }
                        else if (earnings1.equals("> 250000")) {
                            // No loan
                            JOptionPane.showMessageDialog(null,"You are not eligible for the loan");
                            setVisible(false);
                            new Main(mail).setVisible(true);
                        }
                    }
                    else if (fmember.equals("<= 7")) {
                        if (earnings1.equals("<= 100000")) {
                            String value = "19000";
                            java.util.Date date = new java.util.Date();
                            String query = "insert into bank values('"+mail+"', '"+date+"', 'loan', '"+value+"')";
                            conn2.s.executeUpdate(query);
                            JOptionPane.showMessageDialog(null, "Taka " + value + " loan given successfully");
                            setVisible(false);
                            new Main(mail).setVisible(true);
                        }
                        else if (earnings1.equals("<= 150000")) {
                            String value = "17000";
                            java.util.Date date = new java.util.Date();
                            String query = "insert into bank values('"+mail+"', '"+date+"', 'loan', '"+value+"')";
                            conn2.s.executeUpdate(query);
                            JOptionPane.showMessageDialog(null, "Taka " + value + " loan given successfully");
                            setVisible(false);
                            new Main(mail).setVisible(true);
                        }
                        else if (earnings1.equals("<= 200000")) {
                            String value = "15000";
                            java.util.Date date = new java.util.Date();
                            String query = "insert into bank values('"+mail+"', '"+date+"', 'loan', '"+value+"')";
                            conn2.s.executeUpdate(query);
                            JOptionPane.showMessageDialog(null, "Taka " + value + " loan given successfully");
                            setVisible(false);
                            new Main(mail).setVisible(true);
                        }
                        else if (earnings1.equals("<= 250000")) {
                            String value = "10000";
                            java.util.Date date = new java.util.Date();
                            String query = "insert into bank values('"+mail+"', '"+date+"', 'loan', '"+value+"')";
                            conn2.s.executeUpdate(query);
                            JOptionPane.showMessageDialog(null, "Taka " + value + " loan given successfully");
                            setVisible(false);
                            new Main(mail).setVisible(true);
                        }
                        else if (earnings1.equals("> 250000")) {
                            // No loan
                            JOptionPane.showMessageDialog(null,"You are not eligible for the loan");
                            setVisible(false);
                            new Main(mail).setVisible(true);
                        }
                    }
                    else if (fmember.equals("<= 5")) {
                        if (earnings1.equals("<= 100000")) {
                            String value = "10000";
                            java.util.Date date = new java.util.Date();
                            String query = "insert into bank values('"+mail+"', '"+date+"', 'loan', '"+value+"')";
                            conn2.s.executeUpdate(query);
                            JOptionPane.showMessageDialog(null, "Taka " + value + " loan given successfully");
                            setVisible(false);
                            new Main(mail).setVisible(true);
                        }
                        else if (earnings1.equals("<= 150000")) {
                            String value = "7000";
                            java.util.Date date = new java.util.Date();
                            String query = "insert into bank values('"+mail+"', '"+date+"', 'loan', '"+value+"')";
                            conn2.s.executeUpdate(query);
                            JOptionPane.showMessageDialog(null, "Taka " + value + " loan given successfully");
                            setVisible(false);
                            new Main(mail).setVisible(true);
                        }
                        else if (earnings1.equals("<= 200000")) {
                            String value = "5000";
                            java.util.Date date = new java.util.Date();
                            String query = "insert into bank values('"+mail+"', '"+date+"', 'loan', '"+value+"')";
                            conn2.s.executeUpdate(query);
                            JOptionPane.showMessageDialog(null, "Taka " + value + " loan given successfully");
                            setVisible(false);
                            new Main(mail).setVisible(true);
                        }
                        else if (earnings1.equals("<= 250000")) {
                            String value = "3000";
                            java.util.Date date = new java.util.Date();
                            String query = "insert into bank values('"+mail+"', '"+date+"', 'loan', '"+value+"')";
                            conn2.s.executeUpdate(query);
                            JOptionPane.showMessageDialog(null, "Taka " + value + " loan given successfully");
                            setVisible(false);
                            new Main(mail).setVisible(true);
                        }
                        else if (earnings1.equals("> 250000")) {
                            // No loan
                            JOptionPane.showMessageDialog(null,"You are not eligible for the loan");
                            setVisible(false);
                            new Main(mail).setVisible(true);
                        }
                    }
                    else if (fmember.equals("<= 3")) {
                        if (earnings1.equals("<= 100000")) {
                            String value = "5000";
                            java.util.Date date = new java.util.Date();
                            String query = "insert into bank values('"+mail+"', '"+date+"', 'loan', '"+value+"')";
                            conn2.s.executeUpdate(query);
                            JOptionPane.showMessageDialog(null, "Taka " + value + " loan given successfully");
                            setVisible(false);
                            new Main(mail).setVisible(true);
                        }
                        else if (earnings1.equals("<= 150000")) {
                            String value = "3000";
                            java.util.Date date = new java.util.Date();
                            String query = "insert into bank values('"+mail+"', '"+date+"', 'loan', '"+value+"')";
                            conn2.s.executeUpdate(query);
                            JOptionPane.showMessageDialog(null, "Taka " + value + " loan given successfully");
                            setVisible(false);
                            new Main(mail).setVisible(true);
                        }
                        else if (earnings1.equals("<= 200000")) {
                            //no
                            JOptionPane.showMessageDialog(null,"You are not eligible for the loan");
                            setVisible(false);
                            new Main(mail).setVisible(true);
                        }
                        else if (earnings1.equals("<= 250000")) {
                            //no
                            JOptionPane.showMessageDialog(null,"You are not eligible for the loan");
                            setVisible(false);
                            new Main(mail).setVisible(true);
                        }
                        else if (earnings1.equals("> 250000")) {
                            // No loan
                            JOptionPane.showMessageDialog(null,"You are not eligible for the loan");
                            setVisible(false);
                            new Main(mail).setVisible(true);
                        }
                    }
                    // System.out.println("4");
                    
//                    setVisible(false);
//                    new Main(mail).setVisible(true);
//                    
                    
                }
               
            } catch (Exception e) {
                    System.out.println(e);
            }
        }
        else if (ae.getSource() == no) {
            setVisible(false);
            new Main(mail).setVisible(true);
        }
    }
    
    public static void main(String args[]) {
        new loan("");
    }
    
}
