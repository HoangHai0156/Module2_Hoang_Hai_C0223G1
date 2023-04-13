package Bai10;

import java.util.Arrays;

//Bài 10: Thêm 1 phần tử x vào mảng tại vị trí k
public class Main {
    public static void main(String[] args) {
        int x = 10;
        int[] numbers = new int[x];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) ((Math.random() * 100) + (Math.random() * (-100)));
        }
        System.out.println(Arrays.toString(numbers));
        numbers = insertElement(6,345,numbers);
        System.out.println(Arrays.toString(numbers));
    }
    public static int[] insertElement(int index, int element, int[] numbers){
        int[] newNumbers = new int[numbers.length+1];
        for(int i =0; i < numbers.length;i++){
            newNumbers[i] = numbers[i];
        }
        for (int i =index; i < newNumbers.length-1;i++){
            int temp = newNumbers[i];
            newNumbers[i] = newNumbers[newNumbers.length-1];
            newNumbers[newNumbers.length-1] = temp;
        }
        newNumbers[index] = element;
        return newNumbers;
    }
}
