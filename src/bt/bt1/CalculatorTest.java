package bt.bt1;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void testAddPositiveNumbers() {
        Calculator calculator = new Calculator();
        int result = calculator.add(5, 3);
        assertEquals(8, result);
    }
    @Test
    public void testAddNegativeNumbers() {
        Calculator calculator = new Calculator();
        int result = calculator.add(-5, -3);
        assertEquals(-8, result);
    }
    @Test
    public void testAddZero() {
        Calculator calculator = new Calculator();
        int result = calculator.add(0, 0);
        assertEquals(0, result);
    }
    @Test
    public void testSubtractPositiveNumbers() {
        Calculator calculator = new Calculator();
        int result = calculator.subtract(5, 3);
        assertEquals(2, result);
    }
    @Test
    public void testSubtractNegativeNumbers() {
        Calculator calculator = new Calculator();
        int result = calculator.subtract(-5, -3);
        assertEquals(-2, result);
    }
    @Test
    public void testSubtractZero() {
        Calculator calculator = new Calculator();
        int result = calculator.subtract(0, 0);
        assertEquals(0, result);
    }
}
