package session4.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnectionDB {

    public static Connection getMySQLConnection() throws SQLException {
        Connection connection = null;
        //Connection string: Chuoi ket noi den csdl
        String connectionURL = "jdbc:mysql://localhost:3306/cuong";
        connection = DriverManager.getConnection(connectionURL, "root", "");

        return connection;
    }


    public static void main(String[] args) throws SQLException {
        if (getMySQLConnection() != null) {
            System.out.println("Ket noi thanh thong");
        }
    }

}
