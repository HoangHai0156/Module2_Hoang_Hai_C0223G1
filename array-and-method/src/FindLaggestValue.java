import java.util.Scanner;

public class FindLaggestValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;
        do {
            System.out.println("Nhap vao so luong ti phu (khong qua 20)");
            x = scanner.nextInt();
        }while (x <= 0 || x>20);
        int[] fortunes = new int[x];
        for(int i = 0; i < x; i++){
            System.out.println("Nhap vao tai san cua ti phu vi tri "+i);
            fortunes[i] = scanner.nextInt();
        }
        int max = fortunes[0];
        int pos = 0;
        for (int j = 0; j < x; j++){
            if(fortunes[j] > max){
                max = fortunes[j];
                pos = j;
            }
        }
        System.out.println("Tai san lon nhat la "+max+" ti cua ti phu tai vi tri "+pos);
    }
}
