package org.example;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class DivideTest {

    Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testDivisionOfPositiveNumbers() {
        double result = calculator.divide(10.0, 2.0);
        assertEquals(5.0, result, 0.0);
    }

    @Test
    public void testDivisionOfNegativeNumbers() {
        double result = calculator.divide(-8.0, -2.0);
        assertEquals(4.0, result, 0.0);
    }

    @Test
    public void testDivisionOfMixedNumbers() {
        double result = calculator.divide(6.0, -3.0);
        assertEquals(-2.0, result, 0.0);
    }

    @Test
    public void testDivisionByZero() {
        double result = calculator.divide(5.0, 0.0);
        assertEquals(Double.MIN_VALUE, result, 0.0);
    }

    @Test
    public void testDivisionWithZero() {
        double result = calculator.divide(0.0, 4.0);
        assertEquals(0.0, result, 0.0);
    }

    @Test
    public void testDivisionWithInfinity() {
        double result = calculator.divide(3.0, Double.POSITIVE_INFINITY);
        assertEquals(0.0, result, 0.0);
    }
}
