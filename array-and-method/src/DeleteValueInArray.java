import java.util.Arrays;
import java.util.Scanner;

public class DeleteValueInArray {
    public static void main(String[] args) {
        int[] Numbers = {1,5,8,9,9,6,1,10,4,7,9};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mang hien tai la "+ Arrays.toString(Numbers));
        System.out.println("Nhap vao so muon xoa khoi mang");
        int number = scanner.nextInt();
        boolean flag = false;
        for (int i =0; i < Numbers.length ; i++){
            while (number == Numbers[i]){
                for(int j = i; j < Numbers.length-1; j++){
                    Numbers[j]=Numbers[j+1];
                }
                Numbers[Numbers.length-1] = 0;
                flag = true;
            }
        }
        if(flag == false){
            System.out.println("So vua nhap khong co trong mang");
        }else {
            System.out.println("Mang sau khi xoa la " + Arrays.toString(Numbers));
        }
    }
}
