package comparator_interface;

import java.util.Comparator;

public class ComparatorCircle implements Comparator<Circle> {
    @Override
    public int compare(Circle o1, Circle o2) {
        if(o1.getRadius() > o2.getRadius()) return 1;
        else if (o1.getRadius() == o2.getRadius()) return 0;
        else return -1;
    }
}
