package com.parlak.monika.temperature;

public class Temperature {

    protected double temperature;

    public Temperature(double temperature) {
        this.temperature = temperature;
    }


    public void viewTemperature(double temperature){
        System.out.println(temperature);
    }
}
