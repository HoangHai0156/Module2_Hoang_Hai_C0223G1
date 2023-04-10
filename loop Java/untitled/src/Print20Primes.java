
public class Print20Primes {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 2; i < 1000; i++) {
            int flag = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    flag++;
                }
            }
            if (count <= 20) {
                if (flag == 1) {
                    count++;
                    System.out.println(i);
                }
            }
        }
    }
}
