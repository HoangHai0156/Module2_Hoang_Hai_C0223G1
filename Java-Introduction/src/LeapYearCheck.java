import java.util.Scanner;

public class LeapYearCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.println("Nhap vao nam muon kiem tra");
        year = scanner.nextInt();
        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    System.out.println(year+" la nam nhuan");
                }else {
                    System.out.println(year+" khong phai la nam nhuan");
                }
            }else{
                System.out.println(year+" la nam nhuan");
            }
        }else {
            System.out.println(year+" khong phai la nam nhuan");
        }
    }
}
