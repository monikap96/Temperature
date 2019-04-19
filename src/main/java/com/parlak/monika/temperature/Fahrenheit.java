package com.parlak.monika.temperature;

public class Fahrenheit extends Temperature {
    public Fahrenheit(double temperature) throws TemperatureException {
        super(temperature);
        if (toKelvin() < 0)
            throw new TemperatureException();
    }

    public double toCelsius() {
        return (temperature - 32) * (5 / 9);
    }

    public double toKelvin() {
        return (temperature + 459.67) * (5 / 9);
    }
}
