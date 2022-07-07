package com.kodilla.good.patterns.flights;


public class Application {
    public static void main(String[] args) {
        Data data = new Data();
        FlightList flightList = data.prepareData();
        FlightSearch flightSearch = new FlightSearch(flightList.getListOfFlights());
        SearchCreator searchCreator = new SearchCreator();
        Search search = searchCreator.search();
        SerachProcessor serachProcessor = new SerachProcessor();
        serachProcessor.process(search, flightSearch);
    }
}
