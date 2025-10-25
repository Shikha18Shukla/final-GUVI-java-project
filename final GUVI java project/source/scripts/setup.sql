CREATE DATABASE weather;
USE weather;

CREATE TABLE forecasts (
    id INT AUTO_INCREMENT PRIMARY KEY,
    location VARCHAR(100),
    forecast TEXT,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
