import java.util.Scanner;

public class CurrencyConvert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rate = 23000;
        double USD, VND;
        do {
            System.out.println("Nhap vao USD");
            USD = scanner.nextDouble();
        }while (USD < 0);

        VND = USD * rate;
        System.out.println(USD+" USD = "+VND+" VND");
    }
}
