package com.weatherforecast;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ForecastServiceTest {
    @Test
    public void testGetForecast() {
        ForecastService service = new ForecastService();
        String forecast = service.getForecast("New York");
        assertEquals("Sunny with a high of 25°C in New York", forecast);
    }
}
