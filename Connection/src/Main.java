import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws SQLException {
        getAllCustomer();
    }

    public static void getAllCustomer() throws SQLException {
        Connection connection = MySQLConnectionDB.getMySQLConnection();
        Statement stmt = connection.createStatement();

        String query = "select * from customers";

        ResultSet rs = stmt.executeQuery(query);

        //Doc ban ghi cho den het
        while (rs.next()) {
            System.out.println("==================");
            System.out.println("ID: " + rs.getString("customer_id") + ", First Name: " + rs.getString("first_name") + ", Last Name: " + rs.getString("last_name"));
        }
    }

    public static void createCustomer() throws SQLException {
    }

    public static void deleteCustomer() throws SQLException {

    }

    public static void updateCustomer() throws SQLException {

    }
}