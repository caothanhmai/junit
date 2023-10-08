package org.example;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class AverageTest {

    Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testAverageOfPositiveNumbers() {
        double[] arr = { 10.0, 20.0, 30.0, 40.0 };
        double result = calculator.Average(arr);
        assertEquals(25.0, result, 0.0);
    }

    @Test
    public void testAverageWithNegativeValues() {
        double[] arr = { -5.0, -10.0, -15.0 };
        double result = calculator.Average(arr);
        assertEquals(-10.0, result, 0.0);
    }

    @Test
    public void testAverageWithZero() {
        double[] arr = { 0.0, 0.0, 0.0 };
        double result = calculator.Average(arr);
        assertEquals(0.0, result, 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAverageOfEmptyArray() {
        double[] arr = {};
        calculator.Average(arr);
    }
}
