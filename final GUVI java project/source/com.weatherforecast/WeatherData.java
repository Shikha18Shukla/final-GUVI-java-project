package com.weatherforecast;

public class WeatherData {
    private String location;
    private String forecast;

    public WeatherData(String location, String forecast) {
        this.location = location;
        this.forecast = forecast;
    }

    public String getLocation() {
        return location;
    }

    public String getForecast() {
        return forecast;
    }
}
