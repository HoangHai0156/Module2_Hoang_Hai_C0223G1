import java.util.Scanner;

public class NumberConvert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] ones = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        String[] tens = {"","","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
        int i = 0;
        System.out.println("Nhap so muon doc thanh chu (0-999)");
        int number = scanner.nextInt();

        if(number >= 0 && number < 1000){
            if(number < 10){
                System.out.println(ones[number]);
            } else if (number < 20) {
                switch (number - 10){
                    case 0:
                        System.out.println("ten");
                        break;
                    case 1:
                        System.out.println("eleven");
                        break;
                    case 2:
                        System.out.println("twelve");
                        break;
                    case 3:
                        System.out.println("thirteen");
                        break;
                    case 5:
                        System.out.println("fifteen");
                        break;
                    default:
                        i = number - 10;
                        System.out.println(ones[i]+"teen");
                        break;
                }
            } else if (number < 100) {
                int ten = number / 10;
                int one = number % 10;
                switch (one){
                    case 0:
                        System.out.println(tens[ten]);
                        break;
                    default:
                        System.out.println(tens[ten]+" "+ones[one]);
                }
            } else {
                int hundred = number / 100;
                int ten1 = (number % 100) / 10;
                int one1 = number % 10;
                if(one1 == 0){
                    switch (ten1){
                        case 0:
                            System.out.println(ones[hundred]+" hundred");
                            break;
                        case 1:
                            System.out.println(ones[hundred]+" hundred and ten");
                            break;
                        default:
                            System.out.println(ones[hundred]+" and "+tens[ten1]);
                    }
                }
                else{
                    switch (ten1){
                        case 0:
                            System.out.println(ones[hundred]+" hundred and "+ones[one1]);
                        case 1:
                            switch (one1) {
                                case 1:
                                    System.out.println(ones[hundred]+" hundred and eleven");
                                    break;
                                case 2:
                                    System.out.println(ones[hundred]+" hundred and twelve");
                                    break;
                                case 3:
                                    System.out.println(ones[hundred]+" hundred and thirteen");
                                    break;
                                case 5:
                                    System.out.println(ones[hundred]+" hundred and fifteen");
                                    break;
                                default:
                                    System.out.println(ones[hundred]+" hundred and "+ones[one1] + "teen");
                                    break;
                            }
                            break;
                        default:
                            System.out.println(ones[hundred]+" hundred and "+tens[ten1]+" "+ones[one1]);
                    }
                }
            }
        }else {
            System.out.println("out of ability");
        }
    }
}
