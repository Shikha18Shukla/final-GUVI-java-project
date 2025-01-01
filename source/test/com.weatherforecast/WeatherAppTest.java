package com.weatherforecast;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class WeatherAppTest {
    @Test
    public void testMain() {
        WeatherApp.main(new String[]{});
        assertNotNull(new WeatherApp());
    }
}

