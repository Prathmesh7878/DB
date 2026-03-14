package org.example.config;

import java.sql.*;

public class DBConnection {

    private static final String URL = "jdbc:mysql://localhost:3306/olist";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    public static Connection getConnection() {

        Connection conn = null;

        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connected to MySQL database!");

            Statement stmt = conn.createStatement();
            String q = "select customer_id from customers";
            ResultSet rs = stmt.executeQuery(q);

            int i=0;
            while (rs.next() && i<=5){
                String data = rs.getString("customer_id");
                System.out.println(data);
                i++;
            }



        } catch (SQLException e) {
            System.out.println("Database connection failed!");
            e.printStackTrace();
        }

        return conn;
    }
}