import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ModuloTest {

    Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testModuloOfPositiveNumbers() {
        double result = calculator.moduloOfTwoNum(10.0, 3.0);
        assertEquals(1.0, result, 0.0);
    }

    @Test
    public void testModuloWithNegativeValues() {
        double result = calculator.moduloOfTwoNum(-12.0, 5.0);
        assertEquals(-2.0, result, 0.0);
    }

    @Test
    public void testModuloWithZeroDivisor() {
        double result = calculator.moduloOfTwoNum(8.0, 0.0);
        assertEquals(Double.MIN_VALUE, result, 0.0);
    }

    @Test
    public void testModuloOfZero() {
        double result = calculator.moduloOfTwoNum(0.0, 7.0);
        assertEquals(0.0, result, 0.0);
    }

    @Test
    public void testModuloOfLargeNumbers() {
        double result = calculator.moduloOfTwoNum(1000000.0, 999999.0);
        assertEquals(1.0, result, 0.0);
    }
}
