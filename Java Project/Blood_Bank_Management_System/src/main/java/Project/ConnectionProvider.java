package Project;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {
    public static Connection getCon() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/bloodbank", "root", "root");
            return con;
        } catch (ClassNotFoundException | SQLException e) {
            System.out.print(e);
            return null;
        }
    }
}