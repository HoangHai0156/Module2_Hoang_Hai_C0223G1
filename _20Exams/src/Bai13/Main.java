package Bai13;

import java.util.Arrays;

//Bài 13: Xóa tất cả các số chẵn trong mảng
public class Main {
    public static void main(String[] args) {
        int x = 10;
        int[] numbers = new int[x];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) ((Math.random() * 100) + (Math.random() * (-100)));
        }
        System.out.println(Arrays.toString(numbers));
        numbers = removeEven(numbers);
        System.out.println(Arrays.toString(numbers));
    }
    public static int[] removeEven(int[] numbers) {
        int count = 0;
        for (int value : numbers) {
            if (value % 2 == 0) {
                count++;
            }
        }
        System.out.println(count);
        if (count > 0) {
            int[] newNumbers = new int[numbers.length - count];
            for (int i = 0, j = 0; i < numbers.length; i++) {
                if (numbers[i] % 2 != 0) {
                    newNumbers[j] = numbers[i];
                    j++;
                }
            }
            return newNumbers;
        } else {
            return numbers;
        }
    }
}
