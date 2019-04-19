package com.parlak.monika.temperature;

import org.junit.Test;

public class KelvinTest {

    @Test(expected = TemperatureException.class)
    public void testNegative() throws TemperatureException {
        Kelvin kelvin = new Kelvin(-100);
    }

}