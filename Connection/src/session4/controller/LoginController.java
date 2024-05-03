package session4.controller;

import session4.entity.Users;
import session4.model.LoginDaoImpl;

import java.sql.SQLException;

public class LoginController {
    //Step 2. Instance of Model
    LoginDaoImpl login = new LoginDaoImpl();

    public String loginStatementController(Users user) throws SQLException {
        //Step 2
        String message = login.checkLoginStatement(user);

        //Step 3: Return to View
        return message;
    }

    public String loginPreparedStatement(Users user) throws SQLException {
        //Step 2,3
        return login.checkLoginPreparedStatement(user);
    }
}
