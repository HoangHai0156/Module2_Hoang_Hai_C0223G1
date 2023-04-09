import java.util.Scanner;

public class DrawShape2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        int b;
        while (number != 4) {
            System.out.println("Danh muc");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. thoat");
            System.out.println("Chon so tuong ung");
            number = scanner.nextInt();
            switch (number) {
                case 1:
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
                case 2:
                    System.out.println("chon chieu dai canh a");
                    int a = scanner.nextInt();
                    for (int i = 0; i < a; i++) {
                        for (int j = 0; j <= i; j++) {
                            System.out.printf("* ");
                        }
                        System.out.println("");
                    }
                    System.out.println("");
                    for (int i = 0; i < a; i++) {
                        for (int j = 0; j < a - i; j++) {
                            System.out.printf("* ");
                        }
                        System.out.println("");
                    }
                    System.out.println("");
                    for (int i = 0; i < a; i++) {
                        for (int j = 0; j < a; j++) {
                            if(j >= i){
                                System.out.printf("* ");
                            }else {
                                System.out.printf("  ");
                            }
                        }
                        System.out.println("");
                    }
                    System.out.println("");
                    for (int i = 0; i < a; i++) {
                        for (int j = 0; j < a; j++) {
                            if(j >= a-i-1){
                                System.out.printf("* ");
                            }else {
                                System.out.printf("  ");
                            }
                        }
                        System.out.println("");
                    }
                    break;
                case 3:
                    System.out.println("Chon chieu dai canh huyen");
                    b = scanner.nextInt();
                    for (int y = 0; y < b; y++) {
                        for (int x = 0; x < b; x++) {
                            if(x>=b-y-1){
                                System.out.printf("* ");
                            }else {
                                System.out.printf(" ");
                            }
                        }
                        System.out.println("");
                    }
                    break;
                case 4:
                    return;
                default:
                    System.out.println("So khong phu hop! Hay chon lai tu danh muc");
            }
        }
    }
}
