import java.util.Scanner;

public class FindValueInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        System.out.println("Nhap ten sinh vien");
        String name = scanner.nextLine();
        boolean flag = false;
        for(int i = 0; i < students.length; i++){
            if(name.equals(students[i])){
                System.out.println("vi tri cua "+name+" la "+i);
                flag = true;
                break;
            }
        }
        if(flag == false){
            System.out.println("Khong tim thay sinh vien");
        }
    }
}
