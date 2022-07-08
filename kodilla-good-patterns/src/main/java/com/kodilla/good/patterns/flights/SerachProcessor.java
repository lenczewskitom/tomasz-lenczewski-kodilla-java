package com.kodilla.good.patterns.flights;

public class SerachProcessor {

    public void process(Search search, FlightSearch flightSearch) {
        switch (search.getFlightType()) {
            case "From" -> flightSearch.searchByDepartureAirport(search.getDepartureAirport());
            case "To" -> flightSearch.searchByArrival(search.getArrivalAirport());
            case "Through" -> flightSearch.searchFlightThrough(search.getDepartureAirport(), search.getArrivalAirport());
        }
    }
}
