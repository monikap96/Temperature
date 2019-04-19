package com.parlak.monika.temperature;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class FahrenheitTest {

    @Test
    public void testParseToKelvin() throws TemperatureException {
        Fahrenheit fahrenheit = new Fahrenheit(34.15);
        double expectedValue = 274.34;
        double actualValue = fahrenheit.toKelvin();


        actualValue = new BigDecimal(actualValue).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
        Assert.assertTrue(actualValue == expectedValue);
    }
}