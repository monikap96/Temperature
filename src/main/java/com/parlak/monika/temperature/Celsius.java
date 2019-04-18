package com.parlak.monika.temperature;

public class Celsius extends Temperature {
    public Celsius(double temperature) {
        super(temperature);
    }

    public double toFahrenheit() {
        return temperature * (9 / 5) + 32;
    }

    public double toKelvin() {
        return temperature + 273.15;
    }
}
