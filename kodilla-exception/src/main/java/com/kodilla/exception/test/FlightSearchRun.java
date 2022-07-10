package com.kodilla.exception.test;

public class FlightSearchRun {
    public static void main(String[] args) {
        FlightSearch flightSearch = new FlightSearch();

        try {
            flightSearch.searchFlight(new Flight("Warszawa", "Poznań"));
        } catch (RouteNotFoundException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
        System.out.println("Search new flight");
    }
}