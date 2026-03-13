package org.example.config;

import io.github.cdimascio.dotenv.Dotenv;
import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    private static final Dotenv dotenv =
            Dotenv.configure()
                    .directory("./")
                    .ignoreIfMissing()
                    .load();


    System.out.println("HOST=" + HOST);
    System.out.println("PORT=" + PORT);
    System.out.println("DB=" + DB);

//    private static final String HOST = dotenv.get("DB_HOST");
//    private static final String PORT = dotenv.get("DB_PORT");
//    private static final String DB = dotenv.get("DB_NAME");
//    private static final String USER = dotenv.get("DB_USER");
//    private static final String PASSWORD = dotenv.get("DB_PASSWORD");
//
//    private static final String URL =
//            "JDBC:mysql://" + HOST + ":" + PORT + "/" + DB;
//
//    public static Connection getConnection() throws Exception {
//        return DriverManager.getConnection(URL, USER, PASSWORD);
//    }
}