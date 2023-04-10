import java.util.Arrays;

public class LargestValueInMatrix {
    public static void main(String[] args) {
        int[][] matrix = new int[4][3];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = (int) (Math.random() * 100);
            }
        }
        System.out.println("Matrix hien tai la");
        for (int row = 0; row < matrix.length; row++){
            System.out.println(Arrays.toString(matrix[row]));
        }
        int max = matrix[0][0];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if(matrix[row][col] > max){
                    max = matrix[row][col];
                }
            }

        }
        System.out.println("Gia tri lon nhat trong matrix la "+max);
    }
}
