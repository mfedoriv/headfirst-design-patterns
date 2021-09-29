package com.company;

import com.company.display.CurrentConditionsDisplay;
import com.company.subject.WeatherData;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        // StatisticsDisplay = ...
        // ForecastDisplay = ...
        weatherData.setMeasurements(25, 65, 30.4f);
        weatherData.setMeasurements(22, 53, 29.2f);
        weatherData.setMeasurements(19, 93, 29.2f);
    }
}
