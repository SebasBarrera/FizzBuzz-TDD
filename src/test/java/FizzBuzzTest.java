import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.concurrent.ThreadLocalRandom;

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
        assertEquals(
            expected, 
            actual, 
            String.format(
                "Fallo: Se esperaba '%s' pero se obtuvo '%s' para el número %d.", 
                expected, 
                actual, 
                beginningInput
            )
        );
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
        assertEquals(
            expected, 
            actual, 
            String.format(
                "Fallo: Se esperaba '%s' pero se obtuvo '%s' para el múltiplo de 3 %d.", 
                expected, 
                actual, 
                beginningInput
            )
        );
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
        assertEquals(
            expected, 
            actual, 
            String.format(
                "Fallo: Se esperaba '%s' pero se obtuvo '%s' para el múltiplo de 5 %d.", 
                expected, 
                actual, 
                beginningInput
            )
        );
    }

    @Test
    void When_MultipleOf3And5_Then_ReturnFizzBuzz()
    {
        // Arrange
        int beginningInput = 15;
        int beginningRandomInput = beginningInput * ThreadLocalRandom.current().nextInt(1,  1000); 
        String expected = "FizzBuzz";

        // Act
        String actual = FizzBuzz.fizzbuzz(beginningInput);
        String actualAleatorio = FizzBuzz.fizzbuzz(beginningRandomInput);

        // Assert
        assertEquals(
            expected, 
            actual, 
            String.format(
                "Fallo: Se esperaba '%s' pero se obtuvo '%s' para el múltiplo %d.", 
                expected, 
                actual, 
                beginningInput
            )
        );
        assertEquals(
            expected, 
            actualAleatorio, 
            String.format(
                "Fallo: Se esperaba '%s' pero se obtuvo '%s' para el múltiplo aleatorio %d.", 
                expected, 
                actualAleatorio, 
                beginningInput
            )
        );
    }
}