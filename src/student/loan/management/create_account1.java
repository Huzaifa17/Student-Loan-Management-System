package student.loan.management;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
import com.toedter.calendar.JDateChooser;


public class create_account1 extends JFrame implements ActionListener {
    long random;
    JTextField nameTextField, fathernameTextField, fatheroccupationTextField, mothernameTextField, motheroccupationTextField, mailTextField;
    JTextField addressTextField, cityTextField;
    JComboBox familymemberTextField, yearTextField, earningsTextField;
    JRadioButton male, female, shemale, married, unmarried;
    JDateChooser datechooser;
    JButton completed;
    
    create_account1() {
        
        setLayout(null);
        
        Random ran = new Random();
        random = Math.abs((ran.nextLong())) % 1000000L;
        
        JLabel formid = new JLabel("APPLICATION FORM NO. " + random);
        formid.setFont(new Font("Raleway", Font.BOLD, 38));
        formid.setBounds(120, 20, 800, 40);
        add(formid);
        
        JLabel details = new JLabel("Personal Details");
        details.setFont(new Font("Raleway", Font.BOLD, 22));
        details.setBounds(320, 80, 250, 30);
        add(details);
        
        JLabel name = new JLabel("Name:"); // Name
        name.setFont(new Font("Raleway", Font.BOLD, 20));
        name.setBounds(241, 150, 180, 25);
        add(name);
        
        nameTextField = new JTextField(); // name text field
        nameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        nameTextField.setBounds(330, 146, 400, 30);
        add(nameTextField);
        
        JLabel father_name = new JLabel("Father's Name:"); // Father"s Name
        father_name.setFont(new Font("Raleway", Font.BOLD, 20));
        father_name.setBounds(140, 200, 180, 25);
        add(father_name);
        
        fathernameTextField = new JTextField(); // father's name text field
        fathernameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        fathernameTextField.setBounds(330, 196, 400, 30);
        add(fathernameTextField);
        
        
        JLabel father_occupation = new JLabel("Father's Occupation:"); // Father"s Occupation
        father_occupation.setFont(new Font("Raleway", Font.BOLD, 20));
        father_occupation.setBounds(78, 250, 240, 25);
        add(father_occupation);
        
        fatheroccupationTextField = new JTextField(); // father occupation text field
        fatheroccupationTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        fatheroccupationTextField.setBounds(330, 246, 400, 30);
        add(fatheroccupationTextField);
        
        
        JLabel mother_name = new JLabel("Mother's Name:"); // Mother"s Name
        mother_name.setFont(new Font("Raleway", Font.BOLD, 20));
        mother_name.setBounds(134, 300, 190, 25);
        add(mother_name);
        
        mothernameTextField = new JTextField(); // mother's name text field
        mothernameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        mothernameTextField.setBounds(330, 296, 400, 30);
        add(mothernameTextField);
        
        JLabel mother_occupation = new JLabel("Mother's Occupation:"); // Mother"s Occupation
        mother_occupation.setFont(new Font("Raleway", Font.BOLD, 20));
        mother_occupation.setBounds(72, 350, 250, 25);
        add(mother_occupation);
        
        motheroccupationTextField = new JTextField(); // mother occupation text field
        motheroccupationTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        motheroccupationTextField.setBounds(330, 346, 400, 30);
        add(motheroccupationTextField);
        
        JLabel gender = new JLabel("Gender:"); // Gender
        gender.setFont(new Font("Raleway", Font.BOLD, 20));
        gender.setBounds(225, 400, 180, 25);
        add(gender);
        
        male = new JRadioButton("Male");
        male.setBounds(350, 400, 80, 30);
        male.setBackground(Color.WHITE);
        add(male);
        
        female = new JRadioButton("Female");
        female.setBounds(450, 400, 80, 30);
        female.setBackground(Color.WHITE);
        add(female);
        
        shemale = new JRadioButton("Other");
        shemale.setBounds(555, 400, 80, 30);
        shemale.setBackground(Color.WHITE);
        add(shemale);
        
        ButtonGroup gendergroup = new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);
        gendergroup.add(shemale);
        
        JLabel mail = new JLabel("Institutional Email:"); // mail
        mail.setFont(new Font("Raleway", Font.BOLD, 20));
        mail.setBounds(98, 450, 250, 25);
        add(mail);
        
        mailTextField = new JTextField(); // mail text field
        mailTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        mailTextField.setBounds(330, 446, 400, 30);
        add(mailTextField);
        
        JLabel member = new JLabel("Family Member:"); // family_member
        member.setFont(new Font("Raleway", Font.BOLD, 20));
        member.setBounds(131, 500, 250, 25);
        add(member);
        
        String S[] = {"<= 3", "<= 5", "<= 7", ">= 8"};
        familymemberTextField = new JComboBox(S); // family member text field
        familymemberTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        familymemberTextField.setBounds(330, 496, 400, 30);
        add(familymemberTextField);
        
        // address
        JLabel address = new JLabel("Address:"); // address
        address.setFont(new Font("Raleway", Font.BOLD, 20));
        address.setBounds(215, 550, 250, 25);
        add(address);
        
        addressTextField = new JTextField(); // address text field
        addressTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        addressTextField.setBounds(330, 546, 400, 30);
        add(addressTextField);
        
        JLabel city = new JLabel("City:"); // city
        city.setFont(new Font("Raleway", Font.BOLD, 20));
        city.setBounds(260, 600, 250, 25);
        add(city);
        
        cityTextField = new JTextField(); // city text field
        cityTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        cityTextField.setBounds(330, 596, 400, 30);
        add(cityTextField);
        
        JLabel year = new JLabel("Year:"); // year
        year.setFont(new Font("Raleway", Font.BOLD, 20));
        year.setBounds(254, 650, 250, 25);
        add(year);
        
        String S2[] = {"1st", "2nd", "3rd", "4th"};
        yearTextField = new JComboBox(S2); // Year text field
        yearTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        yearTextField.setBounds(330, 646, 400, 30);
        add(yearTextField);
        
        JLabel marital_status = new JLabel("Marital Status:"); // marital status
        marital_status.setFont(new Font("Raleway", Font.BOLD, 20));
        marital_status.setBounds(142, 700, 250, 25);
        add(marital_status);
        
        married = new JRadioButton("Married");
        married.setBounds(350, 700, 80, 30);
        married.setBackground(Color.WHITE);
        add(married);
        
        unmarried = new JRadioButton("Unmarried");
        unmarried.setBounds(450, 700, 110, 30);
        unmarried.setBackground(Color.WHITE);
        add(unmarried);
        
        ButtonGroup marriagegroup = new ButtonGroup();
        marriagegroup.add(married);
        marriagegroup.add(unmarried);
        
        JLabel dob = new JLabel("Date of Birth:"); // date of birth
        dob.setFont(new Font("Raleway", Font.BOLD, 20));
        dob.setBounds(156, 750, 250, 25);
        add(dob);
        
        datechooser = new JDateChooser();
        datechooser.setBounds(330, 750, 400, 30);
        add(datechooser);
        
        JLabel earnings = new JLabel("Family Income(Annually):"); // income
        earnings.setFont(new Font("Raleway", Font.BOLD, 20));
        earnings.setBounds(22, 800, 330, 25);
        add(earnings);
        
        String S3[] = {"<= 100000", "<= 150000", "<= 200000", "<= 250000", "> 250000"};
        earningsTextField = new JComboBox(S3); // income text field
        earningsTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        earningsTextField.setBounds(330, 800, 400, 30);
        add(earningsTextField);
        
        completed = new JButton("Confirm Details"); // create account
        completed.setBackground(Color.BLACK);
        completed.setForeground(Color.WHITE);
        completed.setFont(new Font("Raleway", Font.BOLD, 14));
        completed.setBounds(350, 880, 200, 30);
        completed.addActionListener(this);
        add(completed);
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(850, 1000);
        setLocation(350, 10);
        setVisible(true);
    }
    
     public static void main(String args[]) {
        new create_account1();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String formno = "" + random;
        String name = nameTextField.getText();
        String fathername = fathernameTextField.getText();
        String fatheroccupation = fatheroccupationTextField.getText();
        String mothername = mothernameTextField.getText();
        String motheroccupation = motheroccupationTextField.getText();
        String mail = mailTextField.getText();
        String familymember = (String)familymemberTextField.getSelectedItem();
        String address = addressTextField.getText();
        String city = cityTextField.getText();
        String year = (String)yearTextField.getSelectedItem();
        String earnings = (String)earningsTextField.getSelectedItem();
        String date = ((JTextField)datechooser.getDateEditor().getUiComponent()).getText();
        
        Random random = new Random();
        String pinnumber = "" + ((Math.abs(random.nextInt()) % 9000) + 1000);
        
        String gender = null;  
        if (male.isSelected())
            gender = "Male";
        else if (female.isSelected())
            gender = "Female";
        else
            gender = "Other";
        
        String marital_status = null;
        if (married.isSelected())
            marital_status = "Married";
        else
            marital_status = "Unmarried";
        
        // male, female, shemale, married, unmarried;
        
        try {
            if (name.equals("")) {
                JOptionPane.showMessageDialog(null, "Name is required");
            }
            else if (fathername.equals("")) {
                JOptionPane.showMessageDialog(null, "Father Name is required");
            }
            else if (fatheroccupation.equals("")) {
                JOptionPane.showMessageDialog(null, "Father Occupation is required");
            }
            else if (mothername.equals("")) {
                JOptionPane.showMessageDialog(null, "Mother Name is required");
            }
            else if (motheroccupation.equals("")) {
                JOptionPane.showMessageDialog(null, "Mother Occupation is required");
            }
            else if (mail.equals("")) {
                JOptionPane.showMessageDialog(null, "Email is required");
            }
            else if (familymember.equals("")) {
                JOptionPane.showMessageDialog(null, "Family Member is required");
            }
            else if (address.equals("")) {
                JOptionPane.showMessageDialog(null, "Address is required");
            }
            else if (city.equals("")) {
                JOptionPane.showMessageDialog(null, "City is required");
            }
            else if (year.equals("")) {
                JOptionPane.showMessageDialog(null, "Year is required");
            }
            else if (date.equals("")) {
                JOptionPane.showMessageDialog(null, "Date is required");
            }
            else if (gender.equals("")) {
                JOptionPane.showMessageDialog(null, "Gender is required");
            }
            else if(marital_status.equals("")) {
                JOptionPane.showMessageDialog(null, "Marital Status is required");
            }
            else if (earnings.equals("")) {
                JOptionPane.showMessageDialog(null, "Family Income is required");
            }
            else {
                connected conn = new connected();
                String query = "Insert into create_account1 values('"+formno+"', '"+name+"', '"+fathername+"', '"+fatheroccupation+"', '"+mothername+"', '"+motheroccupation+"', '"+mail+"', '"+familymember+"', '"+address+"', '"+city+"', '"+year+"', '"+date+"', '"+gender+"', '"+marital_status+"', '"+earnings+"', '"+pinnumber+"')";
                conn.s.executeUpdate(query);
                
                String query_ = "Insert into id values('"+mail+"', '"+pinnumber+"')";
                conn.s.executeUpdate(query_);
                JOptionPane.showMessageDialog(null, "Successfully created acoount\n Your password: " + pinnumber);
                setVisible(false);
                new Login().setVisible(true);
            }
            // '"+familymember+"', '"+address+"', '"+city+"', '"+pincode+"', '"+date+"', '"+gender+"', '"+marital_status+"', '"+earnings+"')";
            
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}
