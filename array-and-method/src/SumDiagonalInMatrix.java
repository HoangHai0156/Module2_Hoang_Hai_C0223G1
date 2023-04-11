import java.util.Arrays;
import java.util.Scanner;

public class SumDiagonalInMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao chieu dai cua matrix");
        int x = scanner.nextInt();
        System.out.println("Nhap vao do dai cua mot dong trong matrix");
        int y = scanner.nextInt();
        int[][] matrix = new int[x][y];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.println("Nhap vao gia tri cho matrix tai vi tri dong " + row + " cot " + col);
                matrix[row][col] = scanner.nextInt();
            }
        }
        int diagonalTotal = 0;
        for (int row = 0; row < matrix.length; row++){
            diagonalTotal += matrix[row][row];
        }
        System.out.println("Tong cua duong cheo chinh trong matrix la "+diagonalTotal);
    }
}
