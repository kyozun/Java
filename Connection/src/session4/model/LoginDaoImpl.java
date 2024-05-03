package session4.model;

import session4.entity.Users;

import java.sql.*;

public class LoginDaoImpl implements LoginDAO {
    private static final Connection connection;

    static {
        try {
            connection = MySQLConnectionDB.getMySQLConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private Statement statement = null;
    private PreparedStatement preparedStatement = null;

    @Override
    public String checkLoginStatement(Users user) throws SQLException {

        String username = user.getUser_name();
        String password = user.getPassword();
        //Query
        String query = "select username from users where username like '"+username+"' and password like '"+password+"'";

        //Tạo statement mỗi lần thực thi
        statement = connection.createStatement();

        //Tạo đối tượng ResultSet để nhận kết quả từ database trả về
        ResultSet resultSet = statement.executeQuery(query);

        //Lặp qua toàn bộ bản ghi
        while (resultSet.next()) {
            System.out.println("Username is: " + resultSet.getString("username"));
            return resultSet.getString("username");
        }

        return "Not in the database";
    }

    @Override
    public String checkLoginPreparedStatement(Users user) throws SQLException {
        return "";
    }
}
