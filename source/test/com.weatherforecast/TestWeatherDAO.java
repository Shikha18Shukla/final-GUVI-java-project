
package com.weatherforecast;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestWeatherDAO {

    private WeatherDAO weatherDAO;
    private Connection mockConnection;
    private PreparedStatement mockPreparedStatement;
    private ResultSet mockResultSet;

    @BeforeEach
    public void setUp() throws SQLException {
        // Mocking the database connection and other dependencies
        mockConnection = mock(Connection.class);
        mockPreparedStatement = mock(PreparedStatement.class);
        mockResultSet = mock(ResultSet.class);

        // Creating the WeatherDAO instance
        weatherDAO = new WeatherDAO(mockConnection);
    }

    @Test
    public void testGetWeatherByCity() throws SQLException {
        // Arrange
        String city = "New York";
        String expectedWeather = "Sunny";
        
        // Mock the behavior of the database connection
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeQuery()).thenReturn(mockResultSet);
        when(mockResultSet.next()).thenReturn(true);
        when(mockResultSet.getString("weather")).thenReturn(expectedWeather);

        // Act
        String actualWeather = weatherDAO.getWeatherByCity(city);

        // Assert
        assertEquals(expectedWeather, actualWeather);
    }

    @Test
    public void testInsertWeatherData() throws SQLException {
        // Arrange
        String city = "New York";
        String weather = "Cloudy";

        // Mock the database behavior
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
        when(mockPreparedStatement.executeUpdate()).thenReturn(1); // Simulating successful insert

        // Act
        boolean result = weatherDAO.insertWeatherData(city, weather);

        // Assert
        assertTrue(result);
    }

    @Test
    public void testInsertWeatherDataFailure() throws SQLException {
        // Arrange
        String city = "New York";
        String weather = "Cloud