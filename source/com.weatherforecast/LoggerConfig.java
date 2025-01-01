package com.weatherforecast;

import java.util.logging.*;

public class LoggerConfig {
    public static Logger configureLogger() {
        Logger logger = Logger.getLogger("WeatherAppLogger");
        ConsoleHandler handler = new ConsoleHandler();
        handler.setLevel(Level.ALL);
        logger.addHandler(handler);
        logger.setLevel(Level.ALL);
        return logger;
    }
}

