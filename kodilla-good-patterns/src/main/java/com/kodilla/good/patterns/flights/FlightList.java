package com.kodilla.good.patterns.flights;

import java.util.HashSet;
import java.util.Set;

public class FlightList {
    Set<Flight> listOfFlights = new HashSet<>();

    public void addFlight(Flight flight) {
        listOfFlights.add(flight);
    }

    public Set<Flight> getListOfFlights() {
        return listOfFlights;
    }
}
