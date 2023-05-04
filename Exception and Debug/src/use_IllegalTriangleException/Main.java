package use_IllegalTriangleException;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        boolean flag = false;
        do {
            flag = false;
            try {
                System.out.println("Nhap vao canh 1");
                double side1 = Double.parseDouble(scanner.nextLine());
                System.out.println("Nhap vao canh 2");
                double side2 = Double.parseDouble(scanner.nextLine());
                System.out.println("Nhap vao canh 3");
                double side3 = Double.parseDouble(scanner.nextLine());

                Triangle triangle = new Triangle(side1,side2,side3);
            }catch (IllegalTriangleException illegalTriangleException){
                System.out.println("3 canh tam giac khong hop le! Nhap lai");
                flag = true;
            }
        }while (flag);
    }
}
