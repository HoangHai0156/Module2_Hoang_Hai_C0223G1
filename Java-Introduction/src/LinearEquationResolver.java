import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a;
        double b;
        double x;
        System.out.println("Chuong trinh giai phuong trinh bac 1");
        System.out.println("Cho PTBN ax + b = 0, hay nhap hang so a va b de tim bien x");
        System.out.println("Nhap hang so a");
        a = scanner.nextDouble();
        System.out.println("Nhap hang so b");
        b = scanner.nextDouble();
        if(a == 0 && b == 0){
            System.out.println("Phuong trinh vo so nghiem");
        }
        if(a == 0 && b != 0){
            System.out.println("Phuong trinh vo nghiem");
        }
        if(a != 0){
            x = -b/a;
            System.out.println("Phuong trinh co nghiem x = "+x);
        }

    }
}
