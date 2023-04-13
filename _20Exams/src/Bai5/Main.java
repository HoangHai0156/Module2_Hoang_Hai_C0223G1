package Bai5;

import java.util.Arrays;

//Bài 5: Kiểm tra mảng có giảm dần hay không
public class Main {
    public static void main(String[] args) {
        int x = 10;
        int[] numbers = new int[x];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(numbers));
        interhangeSort(numbers);
        System.out.println(Arrays.toString(numbers));
        boolean flag = true;
        for(int i = 0; i<numbers.length-1;i++){
            if(numbers[i]<numbers[i+1]){
                flag = false;
                break;
            }
        }
        System.out.println(flag);
    }
    public static void interhangeSort(int[] numbers){
        for(int i =0; i < numbers.length-1;i++){
            for(int j = 0 ; j < numbers.length-1-i;j++){
                if(numbers[j]<numbers[j+1]){
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }
    }
}
