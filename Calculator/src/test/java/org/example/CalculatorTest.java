package org.example;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void divide() {
        double result = calculator.divide(10, 2);
        assertEquals(5, result, 0);
    }
}