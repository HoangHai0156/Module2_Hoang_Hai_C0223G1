import java.util.Scanner;
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width;
        int height;
        System.out.println("Nhap vao chieu rong");
        width = scanner.nextInt();
        System.out.println("Nhap vao chieu cao");
        height = scanner.nextInt();
        int S = width*height;
        System.out.println("Dien tich hinh chu nhat do la "+S);
    }
}
