import java.util.Scanner;

public class FahrenheitCelciusConvert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Nhap vao Fahrenheit uon chuyen doi");
                    double fahrenheit = scanner.nextDouble();
                    System.out.println("Celsius la " + fahrenheitToCelsius(fahrenheit));
                    break;
                case 2:
                    System.out.println("Nhap vao Celsius uon chuyen doi");
                    double celsius = scanner.nextDouble();
                    System.out.println("Fahrenheit la " + celsiusToFahrenheit(celsius));
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Nhap vao so tuong ung cac so trong Menu");
            }
        } while (choice != 0);
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }

    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = celsius / (5.0 / 9) + 32;
        return fahrenheit;
    }
}
