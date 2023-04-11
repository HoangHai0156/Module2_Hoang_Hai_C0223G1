import java.util.Scanner;

public class MinValueInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap do dai cho mang");
        int length = scanner.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i< arr.length; i++){
            System.out.println("Nhap vao gia tri cho mang tai vi tri "+i);
            arr[i] = scanner.nextInt();
        }
        int min = arr[0];
        for (int i = 1; i< arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("Gia tri nho nhat trong mang la "+min);
    }
}
