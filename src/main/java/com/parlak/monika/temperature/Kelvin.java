package com.parlak.monika.temperature;

public class Kelvin extends Temperature {
    public Kelvin(double temperature) throws TemperatureException {
        super(temperature);
        if (temperature < 0) {
            throw new TemperatureException();
        }
    }

    public double toCelsius() {
        return temperature - 272.15;
    }

    public double toFahrenheit() {
        return temperature * (9 / 5) - 495.67;
    }


}
