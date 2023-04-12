package StopWatch;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int x = 100000;
        int[] numbers = new int[x];
        for (int i = 0; i<x; i++){
            numbers[i] = (int) (Math.random()*x);
        }
        System.out.println("Mang hien tai la "+ Arrays.toString(numbers));
        StopWatch watch = new StopWatch();
        watch.start();
        selectionSort(numbers);
        System.out.println("Mang sau khi sort la "+Arrays.toString(numbers));
        watch.stop();
        System.out.println("Mat het tong thoi gian la "+watch.getElapsedTime().toMillis()+" millisecond");;
    }
    public static void selectionSort(int[] numbers){
        for (int i = 0; i<numbers.length-1;i++){
            int minIndex = i;
            for (int j = i+1; j<numbers.length;j++){
                if(numbers[minIndex] > numbers[j]){
                    minIndex = j;
                }
            }
            int temp = numbers[minIndex];
            numbers[minIndex] = numbers[i];
            numbers[i] = temp;
        }
    }
}
