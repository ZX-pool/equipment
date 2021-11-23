package it;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtils {
    private static String URL = "jdbc:mysql://localhost:3306/equipment_sales";
    private static String USER_NAME = "admin";
    private static String USER_PASSWORD = "admin";
    private static String DRIVER = "com.mysql.cj.jdbc.Driver";

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName(DRIVER);

        return DriverManager.getConnection(URL,USER_NAME,USER_PASSWORD);
    }
}
