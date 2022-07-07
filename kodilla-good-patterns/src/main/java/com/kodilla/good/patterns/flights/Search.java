package com.kodilla.good.patterns.flights;

public class Search {
    private String flightType;
    private String arrivalAirport;
    private String departureAirport;
    private String throughAirport;

    public Search(String flightType, String departureAirport, String arrivalAirport, String throughAirport) {
        this.flightType = flightType;
        this.arrivalAirport = arrivalAirport;
        this.departureAirport = departureAirport;
        this.throughAirport = throughAirport;
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

    public String getThroughAirport() {
        return throughAirport;
    }
}
