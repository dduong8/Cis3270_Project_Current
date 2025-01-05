package org.example.cis3270_project_current.Main;

public class BookFlight {
    private int flightNum;
    private String flightDate;
    private String flightTime;
    private String departureCity;
    private String arrivalCity;
    private String returnFlight;

    public BookFlight(int flightNum,String flightDate, String flightTime,  String departureCity,
                      String arrivalCity, String returnFlight) {
        this.flightNum = flightNum;
        this.flightDate = flightDate;
        this.flightTime = flightTime;
        this.departureCity = departureCity;
        this.arrivalCity = arrivalCity;
        this.returnFlight = returnFlight;

    }

}
