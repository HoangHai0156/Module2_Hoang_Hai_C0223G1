package Bai14;

import java.util.Arrays;

//Bài 14: Xóa tất cả các phần tử trùng nhau trong mảng và chỉ giữ lại duy nhất 1 phần tử
public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 6, 1, 0, 5, 9, 1, 6};
        System.out.println(Arrays.toString(numbers));
        numbers = removeDuplicate(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    public static int[] removeDuplicate(int[] numbers) {
        int count = 0;
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
        int[] newNumbers = new int[numbers.length - count];
        for (int i = 0, k = 0; i < numbers.length; i++) {
            boolean flag = false;
            for (int j = 0; j < k; j++) {
                if(numbers[i] == newNumbers[j]){
                    flag = true;
                    break;
                }
            }
            if(!flag){
                newNumbers[k] = numbers[i];
                k++;
            }
        }
        return newNumbers;
    }
}
