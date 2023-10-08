package org.example;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SubtractTest {

    Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testSubtractOfPositiveNumbers() {
        double[] arr = { 10.0, 2.0, 3.0 };

        double result = calculator.subtract(arr);

        assertEquals(5.0, result, 0.0); 
    }

    @Test
    public void testSubtractOfNegativeNumbers() {
        double[] arr = { -10.0, -2.0, -3.0 };

        double result = calculator.subtract(arr);

        assertEquals(-5.0, result, 0.0); 
    }

    @Test
    public void testSubtractOfPositiveAndNegativeNumbers() {
        double[] arr = { 10.0, -2.0, 3.0 };

        double result = calculator.subtract(arr);

        assertEquals(9.0, result, 0.0);
    }

    @Test
    public void testSubtractOfZero() {
        double[] arr = { 0.0, 0.0, 0.0 };

        double result = calculator.subtract(arr);

        assertEquals(0.0, result, 0.0); 
    }

    @Test
    public void testSubtractOfEmptyArray() {
        double[] arr = {};

        double result = calculator.subtract(arr);

        assertEquals(0.0, result, 0.0);
    }

    @Test
    public void testSubtractWithNonNumericValues() {
        double[] arr = { 1.0, 2.0, 3.0, Double.NaN, Double.POSITIVE_INFINITY };

        assertThrows(NumberFormatException.class, () -> {
            calculator.subtract(arr);
        });
    }
}
