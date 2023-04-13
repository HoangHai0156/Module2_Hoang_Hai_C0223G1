package Bai6;
//Bài 6: Hãy cho biết tất cả các phần tử trong mảng a có nằm trong mảng b không
public class Main {
    public static void main(String[] args) {
        int[] numbers1 = {1,2,200,3,4};
        int[] numbers2 = {1,2,3,5,4,8,10};
        boolean flag = false;
        for (int i =0; i< numbers1.length;i++){
            flag = false;
            for (int j =0; j<numbers2.length;j++){
                if(numbers1[i] == numbers2[j]){
                    flag = true;
                    break;
                }
            }
            if (!flag){
                break;
            }
        }
        System.out.println(flag);
    }
}
