package Homework20_5;

import java.sql.*;

public class Homework20_5 {
    public static void Initialization() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loaded success");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static final String URL = "jdbc:mysql://localhost:3306/MyJoinsDB";
    public static final String LOGIN = "root";
    public static final String PWD = "Gentelmen098";
    public static void main(String[] args) {
        Initialization();
        Connection connection;
        PreparedStatement contactData;
        PreparedStatement birthdayDateIfNotMarried;
        PreparedStatement birthdayDateIfManager;

        try {
            connection = DriverManager.getConnection(URL, LOGIN, PWD);
            contactData = connection.prepareStatement("select id, telephone_number, place_of_residance from employees\n" +
                    " inner join personal_information on id = employee_id");
            birthdayDateIfNotMarried = connection.prepareStatement("select id, birthday, telephone_number from employees\n" +
                    "inner join personal_information on id = employee_id where is_married = false");
            birthdayDateIfManager = connection.prepareStatement("select id, birthday, telephone_number from employees\n" +
                    "inner join positions on id = positions.employee_id\n" +
                    "inner join personal_information on id = personal_information.employee_id where positions.employee_position = 'Менеджер';");
            ResultSet resultSet = contactData.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String telephoneNumber = resultSet.getString("telephone_number");
                String placeOfResidance = resultSet.getString("place_of_residance");

                System.out.println(id + " " + telephoneNumber + " " + placeOfResidance);
            }
            System.out.println("\n\n");
            resultSet = birthdayDateIfNotMarried.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String telephoneNumber = resultSet.getString("telephone_number");
                String birthday = resultSet.getString("birthday");

                System.out.println(id + " " + birthday + " " + telephoneNumber);
            }
            System.out.println("\n\n");
            resultSet = birthdayDateIfManager.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String telephoneNumber = resultSet.getString("telephone_number");
                String birthday = resultSet.getString("birthday");

                System.out.println(id + " " + birthday + " " + telephoneNumber);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}