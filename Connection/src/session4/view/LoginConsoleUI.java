package session4.view;

import session4.controller.LoginController;
import session4.entity.Users;

import java.sql.SQLException;
import java.util.Scanner;

public class LoginConsoleUI {
    private final Scanner scanner;
    //Step 1: Call Controller
    LoginController loginController = new LoginController();
    Users user = new Users();

    public LoginConsoleUI(Scanner scanner) {
        this.scanner = new Scanner(System.in);
    }

    private int menu() {
        System.out.println("===Admin zone===");
        System.out.println("1. Login Statement");
        System.out.println("2. Login preparedStatement");
        System.out.println("0. Exit");
        int choice = Integer.parseInt(scanner.nextLine());
        return choice;
    }

    public void loginStatementUi() throws SQLException {
        //Get input data from user
        System.out.println("Enter username: ");
        String username = scanner.nextLine();
        System.out.println("Enter password: ");
        String password = scanner.nextLine();

        user.setUser_name(username);
        user.setPassword(password);

        //Step 1: Call Controller
        String result = loginController.loginStatementController(user);

        //In ra kết quả
        System.out.println(result);
    }

    public void loginPreparedStatementUi() throws SQLException {
    }

    public void start() throws SQLException {
        while (true) {
            int choice = menu();
            switch (choice) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    loginStatementUi();
                    break;
                case 2:
                    loginPreparedStatementUi();
                    break;
                default:
                    throw new AssertionError();
            }
        }
    }
}

