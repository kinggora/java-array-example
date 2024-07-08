package jdbc;

import jdbc.vo.Member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class MemberDB {

    private static final String URL = "jdbc:mysql://localhost:3306/employees";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "0909";

    private static Connection connection;

    protected static Connection open() {
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return connection;
    }

    protected static void close() {
        try {
            connection.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
