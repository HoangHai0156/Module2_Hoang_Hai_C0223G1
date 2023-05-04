package thuc_hanh_2;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public static Scanner scanner = new Scanner(System.in);
    public int[] createArray(){
        Random random = new Random();
        int[] arr = new int[100];
        System.out.println("Danh sách phần tử của mảng: " );
        for (int i =0; i < arr.length; i++){
            arr[i] = random.nextInt(100);
            System.out.print(arr[i] +" ");
        }
        System.out.println();
        return arr;
    }

    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        int[] arr = arrayExample.createArray();
        System.out.println("Vui lòng nhập chỉ số của một phần tử bất kỳ: ");
        int index = Integer.parseInt(scanner.nextLine());
        try {
            System.out.println("Giá trị của phần tử có chỉ số " + index + " là " + arr[index]);
        }catch (IndexOutOfBoundsException indexOutOfBoundsException){
            System.err.println("Chỉ số vượt quá giới hạn của mảng");
        }
    }
}
