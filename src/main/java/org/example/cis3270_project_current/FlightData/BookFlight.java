package org.example.cis3270_project_current.FlightData;

public class BookFlight {
    private int flightNum;
    private int ticketNum;
    private String flightDate;
    private String flightArrivalTime;
    private String flightDepartureTime;
    private String departureCity;
    private String destinationCity;
    private String returnFlight;
    private int accountID;

    public BookFlight(int flightNum, int ticketNum, String flightDate, String flightArrivalTime,String flightDepartureTime, String departureCity,
                      String arrivalCity, String returnFlight,int accountID) {
        this.flightNum = flightNum;
        this.ticketNum = ticketNum;
        this.flightDate = flightDate;
        this.flightArrivalTime = flightArrivalTime;
        this.flightDepartureTime = flightDepartureTime;
        this.departureCity = departureCity;
        this.destinationCity = arrivalCity;
        this.returnFlight = returnFlight;
        this.accountID = accountID;

    }
    public int getFlightNum() {
        return flightNum;
    }
    public void setFlightNum(int flightNum) {
        this.flightNum = flightNum;
    }
    public int getTicketNum() {
        return ticketNum;
    }
    public void setTicketNum(int ticketNum) {
        this.ticketNum = ticketNum;
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

    public String getFlightDepartureTime() {return flightDepartureTime;}
    public void setFlightDepartureTime(String flightDepartureTime) {
        this.flightDepartureTime = flightDepartureTime;}

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

    public String getReturnFlight() {
        return returnFlight;
    }
    public void setReturnFlight(String returnFlight) {
        this.returnFlight = returnFlight;
    }

    public int getAccountID() {return accountID;}
    public void setAccountID(int accountID) {this.accountID = accountID;}

}

