import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao mot so");
        int number = scanner.nextInt();
        boolean check = true;
        if(number < 2)
            check = false;
        if(number > 3){
            for(int i = 2; i < number; i++){
                if(number % i == 0)
                    check = false;
            }
        }
        if(check)
            System.out.println(number+" is prime");
        else
            System.out.println(number+" is not prime");
    }
}
