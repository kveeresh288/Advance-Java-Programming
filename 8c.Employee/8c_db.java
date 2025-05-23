package db;

import java.sql.*;

public class DBConnection {
    public static Connection getConnection() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");

        // If your MySQL user is root with no password, leave it blank
        return DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/Employee", "root", ""
        );
    }
}
