package com.parlak.monika.temperature;

import org.junit.Test;

import static org.junit.Assert.*;

public class KelvinTest {

    @Test(expected = KelvinException.class)
    public void testNegative() throws KelvinException {
        Kelvin kelvin = new Kelvin(-100);
    }

}