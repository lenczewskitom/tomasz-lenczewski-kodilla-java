package com.kodilla.good.patterns.flights;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FlightSearch {
    private Set<Flight> listOfFlights;

    public FlightSearch(Set<Flight> listOfFlights) {
        this.listOfFlights = listOfFlights;
    }

    public void searchByDepartureAirport(String airport) {
        System.out.println("Flights available from: " + airport);
        listOfFlights.stream()
                .filter(flight -> flight.getDepartureAirport().equals(airport))
                .map(flight -> flight.toString())
                .forEach(System.out::println);
        System.out.println();
    }

    public void searchByArrival(String airport) {
        System.out.println("Flights available to: " + airport);
        listOfFlights.stream()
                .filter(flight -> flight.getArrivalAirport().equals(airport))
                .map(flight -> flight.toString())
                .forEach(System.out::println);
        System.out.println();
    }

    public void searchFlightThrough(String departureAirport, String throughAirport, String arrivalAirport) {
        System.out.println("Flights available from: " + departureAirport + " through: " + throughAirport + " to " + arrivalAirport);
        List<Flight> flightsThrough = listOfFlights.stream()
                .filter(flight -> flight.getDepartureAirport().equals(departureAirport) && flight.getArrivalAirport().equals(throughAirport))
                .collect(Collectors.toList());
        listOfFlights.stream()
                .filter(flight -> flight.getDepartureAirport().equals(throughAirport) && flight.getArrivalAirport().equals(arrivalAirport))
                .collect(Collectors.toCollection(() -> flightsThrough));
        System.out.println(flightsThrough);
    }
}
