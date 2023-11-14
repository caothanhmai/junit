package demo.calculator_v2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SumTest {

    Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testSumOfPositiveNumbers() {
        double[] arr = { 1.0, 2.0, 3.0 };

        double result = calculator.sum(arr);

        assertEquals(6.0, result, 0);
    }

    @Test
    public void testSumOfNegativeNumbers() {
        double[] arr = { -1.0, -2.0, -3.0 };

        double result = calculator.sum(arr);

        assertEquals(-6.0, result, 0);
    }

    @Test
    public void testSumOfPositiveAndNegativeNumbers() {
        double[] arr = { 1.0, -2.0, 3.0 };

        double result = calculator.sum(arr);

        assertEquals(2.0, result, 0);
    }

    @Test
    public void testSumOfZero() {
        double[] arr = { 0.0, 0.0, 0.0 };

        double result = calculator.sum(arr);

        assertEquals(0.0, result, 0);
    }

    @Test
    public void testSumOfEmptyArray() {
        double[] arr = {};

        double result = calculator.sum(arr);

        assertEquals(0.0, result, 0);
    }
}
