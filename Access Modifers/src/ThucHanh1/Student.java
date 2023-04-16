package ThucHanh1;

public class Student {
    private int rollNo;
    private String name;
    private static String college = "BBDIT";
    Student(int r, String n){
        rollNo = r;
        name = n;
    }
    public static void change(){
        college = "CodeGym";
    }
    void disPlay(){
        System.out.printf("%-3d %-8s %-8s %n",rollNo,name,college);
    }
}
