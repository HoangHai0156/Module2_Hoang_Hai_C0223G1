package thuc_hanh_3;

import java.util.Scanner;

public class CalculationExample {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Hãy nhập x: ");
        int x = Integer.parseInt(scanner.nextLine());
        System.out.println("Hãy nhập y: ");
        int y = Integer.parseInt(scanner.nextLine());
        calculate(x,y);
    }

    public static void calculate(int x, int y) {
        try {
            int a = x * y;
            int b = x + y;
            int c = x / y;
            int d = x - y;
            System.out.println("Tổng x + y = " + b);
            System.out.println("Hiệu x - y = " + d);
            System.out.println("Tích x * y = " + a);
            System.out.println("Thương x / y = " + c);
        } catch (Exception e) {
            System.out.println("Xảy ra ngoại lệ: " + e.getMessage());
        }
    }
}
