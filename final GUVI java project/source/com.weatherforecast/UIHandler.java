package com.weatherforecast;

import java.util.Scanner;

public class UIHandler {
    private final ForecastService forecastService;

    public UIHandler(ForecastService forecastService) {
        this.forecastService = forecastService;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your location: ");
        String location = scanner.nextLine();
        String forecast = forecastService.getForecast(location);
        System.out.println("Weather Forecast: " + forecast);
        scanner.close();
    }
}

