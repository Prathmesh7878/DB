package org.example;

import org.example.config.DBConnection;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) throws Exception {

        Connection conn = DBConnection.getConnection();


    }
}