package org.example.cis3270_project_current.Main;

import java.util.Random;

public class FlightInfo {
    private String flightNum;
    private String flightDate;
    private String flightArrivalTime;
    private String flightDepartureTime;
    private String departureCity;
    private String destinationCity;
    private String passengerName;
    private String returnFlight;
    private int numberOfSeats;

    //constructor to initialize flightnum, flightdate, ect.
    public FlightInfo(String flightNum, String flightDate, String flightArrivalTime,String flightDepartureTime, String departureCity,
                      String destinationCity, String passengerName, String returnFlight, int numberOfSeats) {
        this.flightNum = flightNum;
        this.flightDate = flightDate;
        this.flightArrivalTime = flightArrivalTime;
        this.flightDepartureTime = flightDepartureTime;
        this.departureCity = departureCity;
        this.destinationCity = destinationCity;
        this.passengerName = passengerName;
        this.returnFlight = returnFlight;
        this.numberOfSeats = numberOfSeats;

    }
    public String getFlightNum() {
        return flightNum;
    }
    public static int generateFlightNum() {
        Random rand = new Random();
        int ID = rand.nextInt(10000);
        return ID;
    }






    public void setFlightNum(String flightNum) {
        this.flightNum = flightNum;
    }
    public String getFlightDate() {
        return flightDate;
    }
    public void setFlightDate(String flightDate) {
        this.flightDate = flightDate;
    }
    public String getFlightArrivalTime() {
        return flightArrivalTime;
    }
    public void setFlightArrivalTime(String flightArrivalTime) {
        this.flightArrivalTime = flightArrivalTime;
    }
    public String getFlightDepartureTime() {
        return flightDepartureTime;
    }
    public void setFlightDepartureTime(String flightDepartureTime) {
        this.flightDepartureTime = flightDepartureTime;
    }
    public String getDepartureCity() {
        return departureCity;
    }
    public void setDepartureCity(String departureCity) {
        this.departureCity = departureCity;
    }
    public String getDestinationCity() {
        return destinationCity;
    }
    public void setDestinationCity(String destinationCity) {
        this.destinationCity = destinationCity;
    }
    public String getPassengerName() {
        return passengerName;
    }
    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }
    public String getReturnFlight() {
        return returnFlight;
    }
    public void setReturnFlight(String returnFlight) {
        this.returnFlight = returnFlight;
    }
    public void setNumberOfSeats(int numberOfSeats) {this.numberOfSeats = numberOfSeats;}
    public int getNumberOfSeats() {return numberOfSeats;}

    @Override
    public String toString() {
        return "FlightInfo [flightNum=" + flightNum + ", flightDate=" + flightDate+
                ", flightArrivalTime=" + flightArrivalTime + ",flightDepartureTime="+flightDepartureTime+ ", departureCity=" + departureCity + ", destinationCity="
                + destinationCity;
    }



}
