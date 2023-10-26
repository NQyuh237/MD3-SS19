package bt.bt2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void testMultiplication() {
        double a = 2.0;
        double b = 3.0;
        double expected = 6.0;

        double result = Calculator.multiplication(a, b);

        assertEquals(expected, result, 0.001);
    }
}
