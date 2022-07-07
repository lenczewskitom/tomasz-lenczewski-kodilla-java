package com.kodilla.good.patterns.flights;

import java.util.Scanner;

public class SearchCreator {
    private String flightType;
    private String arrivalAirport;
    private String departureAirport;
    private String throughAirport;
    Scanner scanner = new Scanner(System.in);

    public Search search() {
        System.out.println("Select type of flight from the list: \nFrom\nTo\nThrough");
        flightType = scanner.nextLine();
        switch (flightType) {
            case "From" -> {
                System.out.println("Enter departure airport:");
                departureAirport = scanner.nextLine();
            }
            case "To" -> {
                System.out.println("Enter arrival airport:");
                arrivalAirport = scanner.nextLine();
            }
            case "Through" -> {
                System.out.println("Enter departure, through and arrival airport:");
                departureAirport = scanner.nextLine();
                throughAirport = scanner.nextLine();
                arrivalAirport = scanner.nextLine();
            }
        }
        return new Search(flightType, departureAirport, arrivalAirport, throughAirport);
    }
}
