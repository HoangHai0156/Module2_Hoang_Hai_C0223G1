package resizable_interface;

import java.util.Comparator;

public class ShapesComparator implements Comparator<Shape> {
    boolean areaCompare = true;
    public ShapesComparator(boolean areaCompare){
        this.areaCompare = areaCompare;
    }
    @Override
    public int compare(Shape o1, Shape o2) {
        if (areaCompare){
            if (o1.getArea() > o2.getArea())
                return 1;
            else if (o1.getArea() == o2.getArea())
                return 0;
            else return -1;
        }else {
            if (o1.getPerimeter() > o2.getPerimeter())
                return 1;
            else if (o1.getPerimeter() == o2.getPerimeter())
                return 0;
            else return -1;
        }
    }
}
