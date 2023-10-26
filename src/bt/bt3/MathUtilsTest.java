package bt.bt3;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class MathUtilsTest {

    @Test
    public void testDivision() {
        // Arrange
        double a = 10.0;
        double b = 2.0;

        // Act
        double result = Calculator.division(a, b);

        // Assert
        double expected = 5.0;
        assertEquals(expected, result, 0.0001);
    }

    @Test
    public void testDivisionByZero() {
        // Arrange
        double a = 10.0;
        double b = 0.0;

        // Act and Assert
        try {
            double result = Calculator.division(a, b);
        } catch (ArithmeticException e) {
            return;
        }
        fail("Expected ArithmeticException but it was not thrown.");
    }
}

