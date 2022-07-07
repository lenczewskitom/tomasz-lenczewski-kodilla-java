package com.kodilla.good.patterns.flights;

import java.util.Objects;

public class Flight {
    private String arrivalAirport;
    private String departureAirport;

    public Flight(String departureAirport, String arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
        this.departureAirport = departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight that = (Flight) o;
        return Objects.equals(arrivalAirport, that.arrivalAirport) && Objects.equals(departureAirport, that.departureAirport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(arrivalAirport, departureAirport);
    }

    public String toString() {
        return "Departure: " + getDepartureAirport() + " Arrival: " + getArrivalAirport();
    }
}
