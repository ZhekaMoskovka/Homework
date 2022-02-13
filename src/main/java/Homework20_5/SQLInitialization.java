package Homework20_5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLInitialization {
    public Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/MyJoinsDB", "root", "Gentelmen098");

    public SQLInitialization() throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loaded success");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
