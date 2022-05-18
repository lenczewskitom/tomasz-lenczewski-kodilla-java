package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public double averageTemperatures() {
        double avgTemp = 0;

        for (Map.Entry<String, Double> temperature:
        temperatures.getTemperatures().entrySet()) {
            avgTemp += temperature.getValue();
        }
        return avgTemp/temperatures.getTemperatures().size();
    }

    public double medianTemperatures() {
        double medTemp = 0;
        double avg = 0;
        int i = 0;
        Double[] temperaturesList = new Double[temperatures.getTemperatures().size()];

        for (Map.Entry<String, Double> temperature:
        temperatures.getTemperatures().entrySet()) {
            temperaturesList[i] = temperature.getValue();
            i++;
        }
        Arrays.sort(temperaturesList);

        if (temperaturesList.length % 2 == 0) {
            avg = temperaturesList[temperaturesList.length/2] + temperaturesList[(temperaturesList.length/2)-1];
            medTemp = avg/2;
        }else {
            medTemp = temperaturesList[temperaturesList.length/2];
        }
        return medTemp;
    }
    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0); // [1]
        }
        return resultMap;
    }
}