package com.kodilla.good.patterns.flights;

public class Data {
    private FlightList flightList = new FlightList();

    public FlightList prepareData() {
        FlightList flightList = new FlightList();
        flightList.addFlight(new Flight("Warszawa", "Szczecin"));
        flightList.addFlight(new Flight("Warszawa", "Gdańsk"));
        flightList.addFlight(new Flight("Warszawa", "Poznań"));
        flightList.addFlight(new Flight("Warszawa", "Wrocław"));
        flightList.addFlight(new Flight("Warszawa", "Katowice"));
        flightList.addFlight(new Flight("Szczecin", "Poznań"));
        flightList.addFlight(new Flight("Szczecin", "Katowice"));
        flightList.addFlight(new Flight("Gdańsk", "Wrocław"));
        flightList.addFlight(new Flight("Gdańsk", "Katowice"));
        flightList.addFlight(new Flight("Poznań", "Szczecin"));
        flightList.addFlight(new Flight("Wrocław", "Gdańsk"));
        flightList.addFlight(new Flight("Wrocław", "Warszawa"));
        flightList.addFlight(new Flight("Katowice", "Warszawa"));
        flightList.addFlight(new Flight("Katowice", "Poznań"));

        return flightList;
    }
}
