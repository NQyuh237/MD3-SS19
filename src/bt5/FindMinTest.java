package bt5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FindMinTest {

    @Test
    public void testFindMin() {
        // Arrange
        int[] numbers = {5, 8, 2, 10, 3};

        // Act
        int result = FindMin.findMin(numbers);

        // Assert
        Assertions.assertEquals(2, result);
    }
}