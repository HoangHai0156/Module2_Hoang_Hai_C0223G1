import java.util.Scanner;

public class bmiCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double height, bmi, weight;
        do {
            System.out.println("Nhap vao can nang (Kg)");
            weight = scanner.nextDouble();
        }while (weight <= 0);

        do {
            System.out.println("Nhap vao chieu cao (m)");
            height = scanner.nextDouble();
        }while (height <= 0);

        bmi = (weight / Math.pow(height,2));
        if(bmi < 18.5){
            System.out.println(bmi+" is underweight");
        } else if (bmi < 25) {
            System.out.println(bmi+" is Normal");
        } else if (bmi < 30) {
            System.out.println(bmi+" is Overweight");
        } else {
            System.out.println(bmi+" is Obese");
        }
    }
}
