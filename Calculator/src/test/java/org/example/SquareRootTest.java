package org.example;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class SquareRootTest {

    Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testSquareRootOfPositiveNumber() {
        double result = calculator.squareRoot(16.0);
        assertEquals(4.0, result, 0.0);
    }

    @Test
    public void testSquareRootOfZero() {
        double result = calculator.squareRoot(0.0);
        assertEquals(0.0, result, 0.0);
    }

    @Test
    public void testSquareRootOfNegativeNumber() {
        double result = calculator.squareRoot(-25.0);
        assertEquals(Double.MIN_VALUE, result, 0.0);
    }
}
