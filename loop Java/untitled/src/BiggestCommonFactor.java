import java.util.Scanner;

public class BiggestCommonFactor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so nguyen a");
        int a = scanner.nextInt();
        System.out.println("Nhap vao so nguyen b");
        int b = scanner.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if(a == 0){
            if(b == 0){
                System.out.println("2 so a va b khong co UCLN");
            }else {
                System.out.println("UCLN cua 2 so a va b la "+b);
            }
        }else {
            if (b == 0){
                System.out.println("UCLN cua 2 so a va b la "+a);
            }else {
                while (a != b){
                    if(a > b){
                        a = a - b;
                    }else {
                        b = b - a;
                    }
                }
                System.out.println("UCLN cua 2 so a va b la "+b);
            }
        }
    }
}
