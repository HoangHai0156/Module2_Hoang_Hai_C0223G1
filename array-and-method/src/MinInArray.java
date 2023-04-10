public class MinInArray {
    public static void main(String[] args) {
        int[] arr = {4, 12, -23, 8, 1, 6, 9};
        System.out.println("Gia tri nho nhat trong mang la "+findMin(arr));
    }
    public static int findMin(int[] array){
        int min = array[0];
        for(int i = 0; i< array.length; i++){
            if (array[i] < min){
                min = array[i];
            }
        }
        return min;
    }
}
