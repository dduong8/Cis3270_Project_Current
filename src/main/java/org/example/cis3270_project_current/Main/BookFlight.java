package org.example.cis3270_project_current.Main;

public class BookFlight {
    private int flightNum;
    private int ticketNum;
    private String flightDate;
    private String flightTime;
    private String departureCity;
    private String arrivalCity;
    private String returnFlight;

    public BookFlight(int flightNum,int ticketNum, String flightDate, String flightTime,  String departureCity,
                      String arrivalCity, String returnFlight) {
        this.flightNum = flightNum;
        this.ticketNum = ticketNum;
        this.flightDate = flightDate;
        this.flightTime = flightTime;
        this.departureCity = departureCity;
        this.arrivalCity = arrivalCity;
        this.returnFlight = returnFlight;

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
    public String getReturnFlight() {
        return returnFlight;
    }
    public void setReturnFlight(String returnFlight) {
        this.returnFlight = returnFlight;
    }

}

