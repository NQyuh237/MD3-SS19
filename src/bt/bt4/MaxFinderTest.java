package bt.bt4;

import org.junit.Test;
import static org.junit.Assert.*;

public class MaxFinderTest {

    @Test
    public void testFindMaxWithValidInput() {
        int[] numbers = {1, 5, 3, 7, 2, 8, 4};
        int result = MaxFinder.findMax(numbers);
        assertEquals(8, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindMaxWithEmptyArray() {
        int[] numbers = {};
        MaxFinder.findMax(numbers);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindMaxWithNullArray() {
        int[] numbers = null;
        MaxFinder.findMax(numbers);
    }
}
