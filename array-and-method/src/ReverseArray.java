import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;
        do {
            System.out.println("Nhap do dai cua mang");
            x = scanner.nextInt();
        } while (x <= 0 || x>20);
        int[] arr = new int[x];
        for (int i = 0; i < x; i++) {
            System.out.println("Nhap vao gia tri tai vi tri " + i + " cua mang");
            arr[i] = scanner.nextInt();
        }
        System.out.println("Mang hien tai la: "+Arrays.toString(arr));
        for (int j = 0; j < x / 2; j++) {
            int temp = arr[j];
            arr[j] = arr[x - 1 - j];
            arr[x - 1 - j] = temp;
        }
        System.out.println("Mang reverse la: "+Arrays.toString(arr));
    }
}
