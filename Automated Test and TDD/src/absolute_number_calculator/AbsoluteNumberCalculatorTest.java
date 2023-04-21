package absolute_number_calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AbsoluteNumberCalculatorTest {
    @Test
    @DisplayName("Tìm giá trị tuệt đối cho 0")
    public void absoluteNumberOf0(){
        int number = 0;
        int expected = 0;
        int actual = AbsoluteNumberCalculator.findAbs(number);
        assertEquals(expected,actual);
    }
    @Test
    @DisplayName("Tìm giá trị tuệt đối cho 1")
    public void absoluteNumberOf1(){
        int number = 1;
        int expected = 1;
        int actual = AbsoluteNumberCalculator.findAbs(number);
        assertEquals(expected,actual);
    }
    @Test
    @DisplayName("Tìm giá trị tuệt đối cho -1")
    public void absoluteNumberOfMinus1(){
        int number = -1;
        int expected = 1;
        int actual = AbsoluteNumberCalculator.findAbs(number);
        assertEquals(expected,actual);
    }
}
