package Bai7;

import java.util.Arrays;

//Bài 7: Sắp xếp số dương tăng dần, các số âm giữ nguyên vị trí
public class Main {
    public static void main(String[] args) {
        int x = 10;
        int[] numbers = new int[x];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) ((Math.random() * 100) + (Math.random() * (-100)));
        }
        System.out.println(Arrays.toString(numbers));
        interchangeSortPlus(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    public static void interchangeSortPlus(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] >= 0) {
                int minIndex = i;
                for (int j = i + 1; j < numbers.length; j++) {
                    if (numbers[j] >= 0) {
                        if (numbers[minIndex] > numbers[j]) {
                            minIndex = j;
                        }
                    }
                }
                if (minIndex != i) {
                    int temp = numbers[minIndex];
                    numbers[minIndex] = numbers[i];
                    numbers[i] = temp;
                }
            }
        }
    }
}
