package org.example;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultiplicationTest {

    Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testMultiplicationOfPositiveNumbers() {
        double[] arr = { 3.0, 4.0 };

        double result = calculator.Multiplication(arr);

        assertEquals(12.0, result, 0.0); 
    }

    @Test
    public void testMultiplicationOfNegativeNumbers() {
        double[] arr = { -2.0, -3.0 };

        double result = calculator.Multiplication(arr);

        assertEquals(6.0, result, 0.0);
    }

    @Test
    public void testMultiplicationOfMixedNumbers() {
        double[] arr = { 2.0, -3.0, 0.5, 4.0 };

        double result = calculator.Multiplication(arr);

        assertEquals(-12.0, result, 0.0); 
    }

    @Test
    public void testMultiplicationWithZero() {
        double[] arr = { 1.0, 2.0, 0.0, 4.0 };

        double result = calculator.Multiplication(arr);

        assertEquals(0.0, result, 0.0); 
    }

    @Test
    public void testMultiplicationOfEmptyArray() {
        double[] arr = {};

        double result = calculator.Multiplication(arr);

        assertEquals(1.0, result, 0.0);
    }

    @Test
    public void testMultiplicationWithNonNumericValues() {
        double[] arr = { 1.0, 2.0, 3.0, Double.NaN, Double.POSITIVE_INFINITY };

        assertThrows(NumberFormatException.class, () -> {
            calculator.Multiplication(arr);
        });
    }
}
