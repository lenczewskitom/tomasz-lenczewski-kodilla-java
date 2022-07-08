package com.kodilla.good.patterns.flights;

import java.util.Set;
import java.util.stream.Collectors;

public class FlightSearch {
    private Set<Flight> listOfFlights;

    public FlightSearch(Set<Flight> listOfFlights) {
        this.listOfFlights = listOfFlights;
    }

    public void searchByDepartureAirport(String airport) {
        System.out.println("Available flights from " + airport);
        listOfFlights.stream()
                .filter(flight -> flight.getDepartureAirport().equals(airport))
                .map(flight -> flight.toString())
                .forEach(System.out::println);
        System.out.println();
    }

    public void searchByArrival(String airport) {
        System.out.println("Available flights to " + airport);
        listOfFlights.stream()
                .filter(flight -> flight.getArrivalAirport().equals(airport))
                .map(flight -> flight.toString())
                .forEach(System.out::println);
        System.out.println();
    }

    public void searchFlightThrough(String departureAirport, String arrivalAirport) {
        System.out.println("Undirect flights available from: " + departureAirport + " to " + arrivalAirport);
        Set<Flight> flightsFrom = listOfFlights.stream()
                .filter(flight -> flight.getDepartureAirport().equals(departureAirport))
                .collect(Collectors.toSet());

        Set<Flight> flightsTo = listOfFlights.stream()
                .filter(flight -> flight.getArrivalAirport().equals(arrivalAirport))
                .collect(Collectors.toSet());

        for (Flight flight: flightsFrom) {
            for (Flight flight1: flightsTo) {
                if (flight.getArrivalAirport().equals(flight1.getDepartureAirport())) {
                    System.out.println("Departure " + flight.getDepartureAirport() + " Arrival " + flight.getArrivalAirport()
                    + " Departure " + flight1.getDepartureAirport() + " Arrival " + flight1.getArrivalAirport());
                }
            }
        }
    }
}
