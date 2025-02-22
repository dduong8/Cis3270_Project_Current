package org.example.cis3270_project_current.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import org.example.cis3270_project_current.FlightData.FlightInfo;


public class dbUpdate {

    static Connection connection;
    public static Boolean success;

    static final String dbUser = "dduong8";
    static final String dbPass = "Migradsoon1";
    static final String url = "jdbc:mysql://cis3270dddd.mysql.database.azure.com:3306/project3270";



    public static void deleteFlight(int flightNum){

        success = false;
        try {
            Class.forName("java.sql.Driver");
            System.out.println("Successfully Connected to database");

            Connection connection = DriverManager.getConnection(dbUser, dbPass, url);
            PreparedStatement prepStatement = connection.prepareStatement("DELETE FROM  flights WHERE flight_Num=" +
                    "'" + flightNum + "'");
            prepStatement.executeUpdate();
            connection.close();
            success = true;
        }catch (Exception e) {
            e.printStackTrace();
            success = false;
        }

    }
    public static void deleteBooking(int ticketNum){

        success = false;
        try {
            Class.forName("java.sql.Driver");
            System.out.println("Successfully Connected to database");

            Connection connection = DriverManager.getConnection(dbUser, dbPass, url);
            PreparedStatement prepStatement = connection.prepareStatement("DELETE FROM  bookFlights WHERE ticket_Num=" +
                    "'" + ticketNum + "'");
            prepStatement.executeUpdate();
            connection.close();
            success = true;
        }catch (Exception e) {
            e.printStackTrace();
            success = false;
        }
    }
}
