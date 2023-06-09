package comparable_interface;

import java.util.Arrays;

public class ComparableTest {
    public static void main(String[] args) {
        ComparableCircle[] comparableCircles = new ComparableCircle[3];
        comparableCircles[0] = new ComparableCircle();
        comparableCircles[1] = new ComparableCircle(7.5,"Beige",true);
        comparableCircles[2] = new ComparableCircle(0.5);

//        Circle[] circles = new Circle[3];
//        circles[0] = new Circle();
//        circles[1] = new Circle(7.5,"Beige",true);
//        circles[2] = new Circle(0.5); // không sort được do không tìm thấy interface comparable;

        System.out.println("Pre-sorted: ");
        for(ComparableCircle circle: comparableCircles){
            System.out.println(circle);
        }

        Arrays.sort(comparableCircles);

        System.out.println("After-sorted: ");
        for (ComparableCircle circle: comparableCircles){
            System.out.println(circle);
        }
    }
}
