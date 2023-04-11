import java.util.Scanner;

public class CountValueInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        String str = "CodeGym for life!";
        System.out.println("Nhap vao ky tu muon dem");
        char key = scanner.next().charAt(0);
        String str1 = str.toUpperCase();
        char key1 = Character.toUpperCase(key);
        for (int i =0; i<str.length();i++){
            if(str1.charAt(i) == key1){
                count++;
            }
        }
        System.out.println("Ky tu "+key+" xuat hien "+count+" lan trong mang");
    }
}
