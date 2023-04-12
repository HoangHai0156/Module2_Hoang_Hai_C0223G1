package QuadraticEquationOOP;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao bien a");
        double a = scanner.nextDouble();
        System.out.println("Nhap vao bien b");
        double b = scanner.nextDouble();
        System.out.println("Nhap vao bien c");
        double c = scanner.nextDouble();
        QuadraticEquation quad = new QuadraticEquation(a,b,c);
        double delta = quad.getDiscriminant();
        System.out.printf("Delta cua phuong trinh la %.2f %n",delta);
        if(delta > 0){
            System.out.printf("Nghiem x1 cua phuong trinh la %.2f %n",quad.getRoot1());
            System.out.printf("Nghiem x2 cua phuong trinh la %.2f %n",quad.getRoot2());
        } else if (delta == 0) {
            System.out.printf("Phuong trinh co nghiem chung la %.2f %n",quad.getRoot1());
        }else {
            System.out.println("Phuong trinh vo nghiem");
        }
    }
}
