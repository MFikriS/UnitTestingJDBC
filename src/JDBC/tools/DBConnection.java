package JDBC.tools;

import java.sql.*;

public class DBConnection {

    private Connection con;

    public Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_jdbc", "root", "123456");
        } catch (Exception e) {
            
            System.out.println("Error + " + e.getMessage());

        }
        return con;
    }
}
