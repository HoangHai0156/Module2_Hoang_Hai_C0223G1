import java.util.Arrays;
import java.util.Scanner;

public class ConcatArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array1 = new int[5];
        int[] array2 = new int[7];
        int[] array3 = new int[12];
        for (int i = 0; i < array1.length; i++) {
            System.out.println("Nhap vao gia tri cho mang 1 o vi tri "+i);
            array1[i] = scanner.nextInt();
        }
        for (int i = 0; i < array2.length; i++) {
            System.out.println("Nhap vao gia tri cho mang 2 o vi tri "+i);
            array2[i] = scanner.nextInt();
        }
        for (int i = 0; i < array1.length; i++){
            array3[i] = array1[i];
        }
        for (int i = array1.length; i < array3.length; i++){
            array3[i] = array2[i - array1.length];
        }
        System.out.println("Mang sau khi gop man 1 va 2 la "+ Arrays.toString(array3));
    }
}
