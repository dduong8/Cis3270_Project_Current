package org.example.cis3270_project_current.Main;

public class FlightInfo {
    private String flightNum;
    private String flightDate;
    private String flightTime;
    private String departureCity;
    private String arrivalCity;
    private String passengerName;
    private String ReturnFlight;

    //constructor to initialize flightnum, flightdate, ect.
    public FlightInfo(String flightNum,String flightDate, String flightTime, String departureCity,
                      String arrivalCity, String passengerName, String returnFlight) {
        this.flightNum = flightNum;
        this.flightDate = flightDate;
        this.flightTime = flightTime;
        this.departureCity = departureCity;
        this.arrivalCity = arrivalCity;
        this.passengerName = passengerName;
        this.ReturnFlight = returnFlight;

    }
    public String getFlightNum() {
        return flightNum;
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
    public String getFlightTime() {
        return flightTime;
    }
    public void setFlightTime(String flightTime) {
        this.flightTime = flightTime;
    }
    public String getDepartureCity() {
        return departureCity;
    }
    public void setDepartureCity(String departureCity) {
        this.departureCity = departureCity;
    }
    public String getArrivalCity() {
        return arrivalCity;
    }
    public void setArrivalCity(String arrivalCity) {
        this.arrivalCity = arrivalCity;
    }
    public String getPassengerName() {
        return passengerName;
    }
    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }
    public String getReturnFlight() {
        return ReturnFlight;
    }
    public void setReturnFlight(String returnFlight) {
        ReturnFlight = returnFlight;
    }



}
