package org.example.cis3270_project_current.DB;

import java.sql.*;
import java.util.ArrayList;
import org.example.cis3270_project_current.FlightData.FlightInfo;

public class DBInsertInfo {

    static final String dbUser = "dduong8";
    static final String dbPass = "Migradsoon1";
    static final String url = "jdbc:mysql://cis3270dddd.mysql.database.azure.com:3306/project3270";

    public static boolean success;
    public ArrayList<Object> returnList;



    //Add flights to database
    public static void addFlight(FlightInfo flightinfo){
        success = false;
        try{
            Class.forName("java.sql.Driver");
            System.out.println("Successfully Connected to database");

            Connection connection = DriverManager.getConnection(dbUser, dbPass, url);

            String sqlQuery = "INSERT INTO flights(flight_Num, flight_date, flight_arrival_time," +
                    "flight_departure_time,flight_departure_city, " +
                    "flight_destination_city,return_flight,number_of_seats)" + " VALUES(?,?,?,?,?,?,?,?)";

            PreparedStatement prepStatement = connection.prepareStatement(sqlQuery);

            prepStatement.setInt(1, flightinfo.getFlightNum());
            prepStatement.setString(2, flightinfo.getFlightDate());
            prepStatement.setString(3, flightinfo.getFlightArrivalTime());
            prepStatement.setString(4, flightinfo.getFlightDepartureTime());
            prepStatement.setString(5,flightinfo.getDepartureCity());
            prepStatement.setString(6,flightinfo.getDestinationCity());
            prepStatement.setString(7,flightinfo.getReturnFlight());
            prepStatement.setInt(8,flightinfo.getNumberOfSeats());



            prepStatement.executeUpdate();
            connection.close();
            success = true;



        } catch (Exception e) {
            System.out.println("An error has occurred in the database");
            e.printStackTrace();
            success = false;
        }


    }

}
