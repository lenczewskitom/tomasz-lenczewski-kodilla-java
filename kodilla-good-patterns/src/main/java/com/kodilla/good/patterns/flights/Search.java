package com.kodilla.good.patterns.flights;

public class Search {
    private String flightType;
    private String arrivalAirport;
    private String departureAirport;

    public Search(String flightType, String departureAirport, String arrivalAirport) {
        this.flightType = flightType;
        this.arrivalAirport = arrivalAirport;
        this.departureAirport = departureAirport;
    }

    public String getFlightType() {
        return flightType;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }
}
