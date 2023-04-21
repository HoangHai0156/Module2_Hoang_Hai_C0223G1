package translate_fizz_buzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTranslateTest {

    @Test
    void translate() {
        int number = -3;
        String expected = "số không hợp lệ";
        String actual = FizzBuzzTranslate.translate(number);
        assertEquals(expected,actual);
    }
}