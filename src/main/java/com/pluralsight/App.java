package com.pluralsight;

import java.sql.*;

public class App {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/sakila";
        String username = "root";
        String password = "yearup";

        Connection connection = DriverManager.getConnection(url, username, password);

        Statement statement = connection.createStatement();
        String query = "SELECT city FROM city ";


        ResultSet results = statement.executeQuery(query);

        while (results.next()) {
            String city = results.getString("city");
            System.out.println(city);
        }


        connection.close();
    }
}

