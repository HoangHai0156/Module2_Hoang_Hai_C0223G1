import java.util.Scanner;

public class DrawShape {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = -1;
        while (number != 0) {
            System.out.println("Danh muc");
            System.out.println("1. ve hinh tam giac vuong can");
            System.out.println("2. ve hinh vuong");
            System.out.println("3. ve hinh chu nhat");
            System.out.println("0. thoat");
            System.out.println("Chon so tuong ung");
            number = scanner.nextInt();
            switch (number) {
                case 1:
                    System.out.println("chon chieu dai canh a");
                    int a = scanner.nextInt();
                    for (int i = 0; i < a; i++) {
                        for (int j = 0; j <= i; j++) {
                            System.out.printf("*");
                        }
                        System.out.println("");
                    }
                    break;
                case 2:
                    System.out.println("chon chieu dai canh a");
                    int b = scanner.nextInt();
                    for (int x = 0; x < b; x++) {
                        for (int y = 0; y < b; y++) {
                            System.out.printf("* ");
                        }
                        System.out.println("");
                    }
                    break;
                case 3:
                    System.out.println("chon chieu dai d");
                    int d = scanner.nextInt();
                    System.out.println("chon chieu dai r");
                    int r = scanner.nextInt();
                    for (int g = 0; g < r; g++) {
                        for (int h = 0; h < d; h++) {
                            System.out.printf("* ");
                        }
                        System.out.println("");
                    }
                    break;
                case 0:
                    return;
                default:
                    System.out.println("So khong phu hop! Hay chon lai tu danh muc");
            }
        }
    }
}
