package com.weatherforecast;

public class WeatherApp {
    public static void main(String[] args) {
        System.out.println("Welcome to the Weather Forecast System!");
        ForecastService forecastService = new ForecastService();
        UIHandler uiHandler = new UIHandler(forecastService);
        uiHandler.start();
    }
}
