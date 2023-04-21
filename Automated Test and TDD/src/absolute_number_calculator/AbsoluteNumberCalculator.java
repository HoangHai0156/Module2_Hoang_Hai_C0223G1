package absolute_number_calculator;

public class AbsoluteNumberCalculator {
    public static int findAbs(int number) {
        if (number < 0) return number * -1;
        else return number;
    }
}
