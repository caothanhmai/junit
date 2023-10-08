package org.example;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class FactorialTest {

    Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testFactorialOfZero() {
        int result = calculator.factorial(0);
        assertEquals(1, result);
    }

    @Test
    public void testFactorialOfOne() {
        int result = calculator.factorial(1);
        assertEquals(1, result);
    }

    @Test
    public void testFactorialOfPositiveNumber() {
        int result = calculator.factorial(5);
        assertEquals(120, result);
    }

    @Test
    public void testFactorialOfNegativeNumber() {
        int result = calculator.factorial(-5);
        assertEquals(0, result);
    }
}
