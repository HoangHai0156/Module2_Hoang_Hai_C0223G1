import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so tien gui");
        double money = scanner.nextDouble();
        System.out.println("Nhap lai suat moi nam (%)");
        double rate = scanner.nextDouble();
        System.out.println("Nhap so thang muon gui");
        int month = scanner.nextInt();
        double interest = 0.0;
        for(int i = 0; i < month; i++){
            interest += money * (rate/100)/12 * month;
        }
        System.out.println("So tien lai la: "+interest);
    }
}
