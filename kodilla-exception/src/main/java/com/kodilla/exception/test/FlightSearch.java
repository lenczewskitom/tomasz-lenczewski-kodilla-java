package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearch {

    private Map<String, Boolean> flightsList;

    public FlightSearch() {
        flightsList = new HashMap<>();
        flightsList.put("Warszawa",true);
        flightsList.put("Gdańsk", true);
        flightsList.put("Katowice", true);
        flightsList.put("Radom", false);
        flightsList.put("Wrocław", false);
    }

    public void searchFlight(Flight flight) throws RouteNotFoundException {
        if (!flightsList.containsKey(flight.getDepartureAirport())) {
            throw new RouteNotFoundException("Departure airport doesn't exists");
        }
        if (!flightsList.containsKey(flight.getArrivalAirport())) {
            throw new RouteNotFoundException("Arrival airport doesn't exists");
        }
    }
}
