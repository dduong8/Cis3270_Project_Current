package org.example.cis3270_project_current.DB;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
    public Connection linkDB;

    public Connection getConnection() {
        String dbUser = "dduong8";
        String dbPass = "Migradsoon1";
        String url = "jdbc:mysql://cis3270dddd.mysql.database.azure.com:3306/project3270";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            linkDB = DriverManager.getConnection(url,dbUser,dbPass);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return linkDB;

    }
}