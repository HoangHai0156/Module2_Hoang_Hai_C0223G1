import java.util.Arrays;
import java.util.Scanner;

public class InsertValueInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] Numbers = new int[]{2,5,8,4,9,6,3,7,20,14};
        System.out.println("Mang hien tai la "+Arrays.toString(Numbers));
        System.out.println("Nhap vao so muon chen");
        int ins_number = scanner.nextInt();
        System.out.println("Nhap vao vi tri muon chen");
        int ins_index = scanner.nextInt();
        if(ins_index < 0 || ins_index > Numbers.length-1){
            System.out.println("Khong the chen so vao mang");
        }else {
            for(int i = Numbers.length -1; i > ins_index; i--){
                Numbers[i] = Numbers[i-1];
            }
            Numbers[ins_index] = ins_number;
        }
        System.out.println("Mang sau khi chen la "+Arrays.toString(Numbers));
    }
}
