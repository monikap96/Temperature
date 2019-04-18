package com.parlak.monika.temperature;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class CelsiusTest {


    @Test
    public void testCorrect() {
        Celsius celsius = new Celsius(100);

        double expectedValue = 373.15;
        double actualValue = celsius.toKelvin();

        assertTrue(expectedValue==actualValue);
    }


}