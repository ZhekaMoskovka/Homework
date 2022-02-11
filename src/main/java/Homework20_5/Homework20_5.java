package Homework20_5;

import java.sql.*;

public class Homework20_5 {



    public static void main(String[] args) {
        PreparedStatement contactData;
        PreparedStatement birthdayDateIfNotMarried;
        PreparedStatement birthdayDateIfManager;

        try {
            SQLInitialization sqlInitialization = new SQLInitialization();
            contactData = sqlInitialization.connection.prepareStatement("select id, telephone_number, place_of_residance from employees\n" +
                    " inner join personal_information on id = employee_id");
            birthdayDateIfNotMarried = sqlInitialization.connection.prepareStatement("select id, birthday, telephone_number from employees\n" +
                    "inner join personal_information on id = employee_id where is_married = false");
            birthdayDateIfManager = sqlInitialization.connection.prepareStatement("select id, birthday, telephone_number from employees\n" +
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