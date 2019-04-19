package com.parlak.monika.temperature;

public class Celsius extends Temperature {
    public Celsius(double temperature) throws TemperatureException {
        super(temperature);
        if (toKelvin() < 0)
            throw new TemperatureException();
    }

    public double toFahrenheit() {
        return temperature * (9 / 5) + 32;
    }

    public double toKelvin() {
        return temperature + 273.15;
    }
}
