package student.loan.management;
import java.sql.*;
/**
 *
 * @author huzaifa
 */
public class connected {
    Connection c;
    Statement s;
    public connected() {
        try {
            c = DriverManager.getConnection("jdbc:mysql:///studentloanmanagementsystem", "root", "huzaifa");
            s = c.createStatement();
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}
