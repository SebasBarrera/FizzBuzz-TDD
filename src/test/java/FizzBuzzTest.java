import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {

    @Test
    void When_NumberIsNotMultipleOf3Or5_Then_ReturnNumberAsString() {
        // Verifica que un número que no es múltiplo de 3 o 5 se devuelva como string
        assertEquals("1", FizzBuzz.fizzbuzz(1));
        assertEquals("7", FizzBuzz.fizzbuzz(7));
    }

    @Test
    void When_MultipleOf3_Then_ReturnFizz() {
        // Verifica que un múltiplo de 3 devuelva "Fizz"
        assertEquals("Fizz", FizzBuzz.fizzbuzz(3));
        assertEquals("Fizz", FizzBuzz.fizzbuzz(6));
    }

    @Test
    void When_MultipleOf5_Then_ReturnBuzz() {
        // Verifica que un múltiplo de 5 devuelva "Buzz"
        assertEquals("Buzz", FizzBuzz.fizzbuzz(5));
        assertEquals("Buzz", FizzBuzz.fizzbuzz(10));
    }

    @Test
    void When_MultipleOf3And5_Then_ReturnFizzBuzz() {
        // Verifica que un múltiplo de 3 y 5 devuelva "FizzBuzz"
        assertEquals("FizzBuzz", FizzBuzz.fizzbuzz(15));
        assertEquals("FizzBuzz", FizzBuzz.fizzbuzz(30));
    }
}