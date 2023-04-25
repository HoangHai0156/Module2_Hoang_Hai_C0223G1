package resizable_interface;

import java.util.Comparator;

public class ColorOrNameComparator implements Comparator<Shape> {
    boolean colorComparator = true;
    public ColorOrNameComparator(boolean colorComparator){
        this.colorComparator = colorComparator;
    }
    @Override
    public int compare(Shape o1, Shape o2) {
        if (colorComparator){
            return o1.getColor().compareTo(o2.getColor());
        }else
            return o1.getName().compareTo(o2.getName());
    }
}
