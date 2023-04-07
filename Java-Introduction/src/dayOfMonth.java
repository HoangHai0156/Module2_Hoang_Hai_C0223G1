import java.util.Scanner;

public class dayOfMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month;
        System.out.println("Nhap vao thang muon xem so ngay");
        month = scanner.nextInt();
        switch (month){
            case 2:
                System.out.println("Thang 2 co 28 ngay");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Thang "+month+" Co 30 ngay");
                break;
            default:
                System.out.println("Thang "+month+" Co 31 ngay");
                break;
        }
    }
}
