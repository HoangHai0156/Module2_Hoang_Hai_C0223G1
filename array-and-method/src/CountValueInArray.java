import java.util.Scanner;

public class CountValueInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length;
        do {
            System.out.println("Nhap vao so luong sinnh vien");
            length = scanner.nextInt();
        } while (length <= 0 || length > 30);
        int[] marks = new int[length];
        for (int i =0; i < marks.length; i++){
            System.out.println("Nhap vao so diem cua sinh vien "+i);
            marks[i] = scanner.nextInt();
        }
        int count = 0;
        for (int i = 0; i < marks.length; i++){
            if (marks[i]>=5){
                count++;
            }
        }
        System.out.println("so sinh vien thi do la "+count);
    }
}
