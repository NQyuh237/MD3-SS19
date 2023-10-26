package bt4;


import org.junit.Test;
import static bt4.FindMax.findMax;
import org.junit.jupiter.api.Assertions;

public class FindMaxTest {

    @Test
    public void testFindMax() {
        // Arrange
        int[] numbers = {5, 8, 2, 10, 3};

        // Act
        int result = findMax(numbers);

        // Assert
        Assertions.assertEquals(10, result);
    }

    @Test
    public void testFindMax_EmptyArray() {
        // Arrange
        int[] numbers = {};

        // Act and Assert
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            findMax(numbers);
        });
    }

    @Test
    public void testFindMax_NullArray() {
        // Arrange
        int[] numbers = null;

        // Act and Assert
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            findMax(numbers);
        });
    }
}