package bai16;
//

public class Main {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 1, 1, 0, 0, 0},
                {0, 1, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0},
                {0, 0, 2, 4, 4, 0},
                {0, 0, 0, 2, 0, 0},
                {0, 0, 1, 2, 4, 0}
        };
        int maxSum = findMaxSandClockSum(arr);
        System.out.println("Tổng lớn nhất của đồng hồ cát là: " + maxSum);
    }
    public static int findMaxSandClockSum(int[][] arr) {
        int maxSum = Integer.MIN_VALUE;
        int rows = arr.length;
        int columns = arr[0].length;
        for (int i = 0; i <= rows - 3; i++) {
            for (int j = 0; j <= columns - 3; j++) {
                int sum = calculateSandClockSum(arr, i, j);
                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
        }
        return maxSum;
    }
    public static int calculateSandClockSum(int[][] arr, int row, int col) {
        int sum = 0;
        // Tính tổng các phần tử của đồng hồ cát
        sum += arr[row][col] + arr[row][col + 1] + arr[row][col + 2];
        sum += arr[row + 1][col + 1];
        sum += arr[row + 2][col] + arr[row + 2][col + 1] + arr[row + 2][col + 2];
        return sum;
    }
}
