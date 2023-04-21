package translate_fizz_buzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTranslateTest {

    @Test
    void translate() {
        int number = 277;
        String expected = "277";
        String actual = FizzBuzzTranslate.translate(number);
        assertEquals(expected,actual);
    }
}