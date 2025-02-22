import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {

    @Test
    void When_NumberIsNotMultipleOf3Or5_Then_ReturnNumberAsString()
    {
        // Arrange
        int beginningInput = 1;
        String expected = "1";

        // Act
        String actual = FizzBuzz.fizzbuzz(beginningInput);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    void When_MultipleOf3_Then_ReturnFizz()
    {
        // Arrange
        int beginningInput = 3;
        String expected = "Fizz";

        // Act
        String actual = FizzBuzz.fizzbuzz(beginningInput);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    void When_MultipleOf5_Then_ReturnBuzz()
    {
        // Arrange
        int beginningInput = 5;
        String expected = "Buzz";

        // Act
        String actual = FizzBuzz.fizzbuzz(beginningInput);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    void When_MultipleOf3And5_Then_ReturnFizzBuzz()
    {
        // Arrange
        int beginningInput = 15;
        String expected = "FizzBuzz";

        // Act
        String actual = FizzBuzz.fizzbuzz(beginningInput);

        // Assert
        assertEquals(expected, actual);
    }
}