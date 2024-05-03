package session4.model;

import session4.entity.Users;

import java.sql.SQLException;

public class LoginDaoImpl implements LoginDAO {

    @Override
    public String checkLoginStatement(Users user) throws SQLException {
        return "";
    }

    @Override
    public String checkLoginPreparedStatement(Users user) throws SQLException {
        return "";
    }
}
