package Bai9;

import java.util.Arrays;

//Bài 9: Sắp xếp số dương tăng dần, âm giảm dần. Vị trí tương đối không thay đổi
public class Main {
    public static void main(String[] args) {
        int x = 10;
        int[] numbers = new int[x];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) ((Math.random() * 100) + (Math.random() * (-100)));
        }
        System.out.println(Arrays.toString(numbers));
        selectorSortPlus(numbers);
        System.out.println(Arrays.toString(numbers));

    }
    public static void selectorSortPlus(int[] numbers){
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > 0) {
                int minIndex = i;
                for (int j = i + 1; j < numbers.length; j++) {
                    if (numbers[j] > 0) {
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
            }else if (numbers[i]<0){
                int maxIndex = i;
                for (int j = i + 1; j < numbers.length; j++) {
                    if (numbers[j] < 0) {
                        if (numbers[maxIndex] < numbers[j]) {
                            maxIndex = j;
                        }
                    }
                }
                if (maxIndex != i) {
                    int temp = numbers[maxIndex];
                    numbers[maxIndex] = numbers[i];
                    numbers[i] = temp;
                }
            }

        }
    }
}
