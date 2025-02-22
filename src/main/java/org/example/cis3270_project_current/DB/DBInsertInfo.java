package org.example.cis3270_project_current.DB;

import java.sql.*;
import java.util.ArrayList;



import org.example.cis3270_project_current.FlightData.BookFlight;
import org.example.cis3270_project_current.FlightData.FlightInfo;
import org.example.cis3270_project_current.Registration_Login.RegisterAccount;

public class DBInsertInfo {

    static final String dbUser = "dduong8";
    static final String dbPass = "Migradsoon1";
    static final String url = "jdbc:mysql://cis3270dddd.mysql.database.azure.com:3306/project3270";

    public static boolean success;
    public ArrayList<Object> returnList;




// Add account to database
    public static void addAccount(RegisterAccount registerAccount){
        success = false;
        try{
            Class.forName("java.sql.Driver");
            System.out.println("Successfully Connected to database");

            Connection connection = DriverManager.getConnection(dbUser, dbPass, url);

            String sqlQuery = "INSERT INTO account(first_name, last_name ,address,zip, state, username, " +
                    "email_id, social_sec_Num, account_id, security_question, security_answer" +
                    "is_Admin_Account )" + " VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)";

            PreparedStatement prepStatement = connection.prepareStatement(sqlQuery);

            prepStatement.setString(1, registerAccount.getFirstName());
            prepStatement.setString(2, registerAccount.getLastName());
            prepStatement.setString(3, registerAccount.getAddress());
            prepStatement.setInt(4, registerAccount.getZip());
            prepStatement.setString(5, registerAccount.getState());
            prepStatement.setString(6, registerAccount.getUserName());
            prepStatement.setString(7, registerAccount.getEmailId());
            prepStatement.setInt(8,registerAccount.getSocialSecNum());
            prepStatement.setInt(9,registerAccount.getAccountID());
            prepStatement.setString(10, registerAccount.getSecurityQuestion());
            prepStatement.setString(11, registerAccount.getSecurityQuestionAnswer());
            prepStatement.setBoolean(12,registerAccount.isAdminAccount);



            prepStatement.executeUpdate();
            connection.close();
            success = true;



        } catch (SQLIntegrityConstraintViolationException e) {
            System.out.println("An account with this email already exists");
            e.printStackTrace();
            success = false;
        }catch (Exception e){
            System.out.println("An error has occurred in the database");
        }


    }




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
    public static void addBooking(BookFlight bookFlight){
        success = false;
        try{
            Class.forName("java.sql.Driver");
            System.out.println("Successfully Connected to database");

            Connection connection = DriverManager.getConnection(dbUser, dbPass, url);
            String sqlQuery = "INSERT INTO bookFlights(flight_num, ticket_Num, flight_date, flight_arrival_time," +
                    "flight_departure_time, flight_departure_city, " +
                    "flight_destination_city, return_flight, account_ID)" + " VALUES(?,?,?,?,?,?,?,?,?)";

            // removes a seat from total flight num after flight is booked
            String sql ="UPDATE flights SET number_of_seats = number_of_seats -1 WHERE flight_number=" + "'"
                    + BookFlight.getFlightNum() + "'";

            PreparedStatement prepStatement2 = connection.prepareStatement(sql);
            prepStatement2.executeUpdate();





            PreparedStatement prepStatement = connection.prepareStatement(sqlQuery);

            prepStatement.setInt(1, bookFlight.getFlightNum());
            prepStatement.setInt(2, bookFlight.getTicketNum());
            prepStatement.setString(3, bookFlight.getFlightDate());
            prepStatement.setString(4, bookFlight.getFlightArrivalTime());
            prepStatement.setString(5, bookFlight.getFlightDepartureTime());
            prepStatement.setString(6, bookFlight.getDepartureCity());
            prepStatement.setString(7, bookFlight.getDestinationCity());
            prepStatement.setString(8, bookFlight.getReturnFlight());
            prepStatement.setInt(9,bookFlight.getAccountID());

            prepStatement.executeUpdate();
            connection.close();
            success = true;


        } catch (Exception e) {
            System.out.println("An error has occurred in the database");
            e.printStackTrace();
            success = false;
        } catch (SQLIntegrityConstraintViolationException e1){
            System.out.println("You have already booked this flight, please select another one");
            e1.printStackTrace();
        } catch (SQLException e2){
            System.out.println("Syntax error");
        }catch (ClassNotFoundException e3) {
            e3.printStackTrace();
        }

    }

}
