package org.example.cis3270_project_current.DB;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import org.example.cis3270_project_current.FlightData.FlightInfo;

import java.sql.*;
import java.util.ArrayList;



public class dbSearchFlight {
    static final String dbUser = "dduong8";
    static final String dbPass = "Migradsoon1";
    static final String url = "jdbc:mysql://cis3270dddd.mysql.database.azure.com:3306/project3270";

    public static ObservableList<FlightInfo> searchFlights(String departFrom, String arriveTo,
                                                           String FlightDepartDate, String FlightReturnDate){

        ObservableList<FlightInfo> flightsInfo = FXCollections.observableArrayList();

        try {
            Class.forName("java.sql.Driver");
            System.out.println("Successfully Connected to database");

            Connection connection = DriverManager.getConnection(dbUser, dbPass, url);

            PreparedStatement prepStatement = connection.prepareStatement("SELECT * FROM flights WHERE departure_city=" + "'" + departFrom + "'" +
                    "and destination_city=" + "'" + arriveTo + "'" + "and flight_date=" + "'" + FlightDepartDate + "'"
                    + "and return_day=" + "'" + FlightReturnDate + "'");

            ResultSet resultSet = prepStatement.executeQuery();

            while (resultSet.next()) {


                FlightInfo flightInfo = new FlightInfo();

                flightInfo.setFlightNum(resultSet.getInt("flight_Num"));
                flightInfo.setFlightDate(resultSet.getString("flight_date"));
                flightInfo.setFlightArrivalTime(resultSet.getString("flight_arrival_time"));
                flightInfo.setFlightDepartureTime(resultSet.getString("flight_departure_time"));
                flightInfo.setDepartureCity(resultSet.getString("flight_departure_city"));
                flightInfo.setDestinationCity(resultSet.getString("flight_destination_city"));
                flightInfo.setReturnFlight(resultSet.getString("return_flight"));
                flightInfo.setNumberOfSeats(resultSet.getInt("number_of_seats"));

                flightsInfo.add(flightInfo);
            }
            connection.close();


        } catch (Exception e) {
            System.out.println("An error has occurred in the database");
        }
        return flightsInfo;

    }


    }


