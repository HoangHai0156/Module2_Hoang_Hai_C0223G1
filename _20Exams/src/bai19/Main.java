package bai19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Integer[] integers = {2,5,8,9,12,25,30,65};
        List<Integer> integerList = new ArrayList<>(List.of(integers));

        String string = integerList.toString();
        string = string.replaceAll(",","");
        string = string.replaceAll("\\[","");
        string = string.replaceAll("]","");

        System.out.println(integerList.size());
        System.out.println(string);
        System.out.println(2);

        System.out.println("Insert");
        int index = Integer.parseInt(scanner.nextLine());
        int value = Integer.parseInt(scanner.nextLine());
        integerList.add(index,value);

        System.out.println("Delete");
        int deleIndex = Integer.parseInt(scanner.nextLine());
        integerList.remove(deleIndex);

        string = integerList.toString();
        string = string.replaceAll(",","");
        string = string.replaceAll("\\[","");
        string = string.replaceAll("]","");
        System.out.println(string);
    }
}
