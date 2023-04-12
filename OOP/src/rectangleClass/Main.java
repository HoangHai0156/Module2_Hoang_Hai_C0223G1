package rectangleClass;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Rectangle rect1 = new Rectangle();
        System.out.println("Nhap vao chieu dai cho HCN 2");
        double width = scanner.nextDouble();
//        scanner.nextLine();
        System.out.println("Nhap vao chieu rong cho HCN 2");
        double height = scanner.nextDouble();
        Rectangle rect2 = new Rectangle(width, height);
        rect1.display();
        rect2.display();
        System.out.printf("Dien tich HCN1 la %.2f %n", rect1.getArea());
        System.out.printf("Dien tich HCN2 la %.2f %n", rect2.getArea());
        System.out.printf("Chu vi HCN 1 la %.2f %n", rect1.getPerimeter());
        System.out.printf("Chu vi HCN 2 la %.2f %n", rect2.getPerimeter());
    }
}
