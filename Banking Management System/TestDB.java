import java.sql.Connection;
import java.sql.DriverManager;

public class TestDB {
    public static void main(String[] args) {
        try {
            String url = "jdbc:mysql://localhost:3306/bankdb";
            String user = "root";
            String password = "@07MAR2006";

            Connection con = DriverManager.getConnection(url, user, password);

            System.out.println("Connected Successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}