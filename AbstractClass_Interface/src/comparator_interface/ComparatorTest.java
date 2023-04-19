package comparator_interface;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorTest {
    public static void main(String[] args) {
//        ComparatorCircle[] comparableCircles = new ComparatorCircle[3];
//        comparableCircles[0] = new ComparatorCircle();
//        comparableCircles[1] = new ComparatorCircle(7.5,"Beige",true);
//        comparableCircles[2] = new ComparatorCircle(0.5);

        Circle[] circles = new Circle[3];
        circles[0] = new Circle();
        circles[1] = new Circle(7.5,"Beige",true);
        circles[2] = new Circle(0.5);

        System.out.println("Pre-sorted: ");
        for(Circle circle: circles){
            System.out.println(circle);
        }

        Comparator comparator = new ComparatorCircle();
        Arrays.sort(circles, comparator);

        System.out.println("After-sorted: ");
        for (Circle circle: circles){
            System.out.println(circle);
        }
    }
}
