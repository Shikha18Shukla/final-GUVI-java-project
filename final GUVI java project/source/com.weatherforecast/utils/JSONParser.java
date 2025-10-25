package com.weatherforecast.utils;

import org.json.JSONObject;

public class JSONParser {
    public static String parseForecast(String jsonResponse) {
        // Parse JSON response (placeholder)
        JSONObject json = new JSONObject(jsonResponse);
        return json.optString("forecast", "No forecast available");
    }
}

