package resizable_interface;

import java.util.Arrays;

/**
 * Thêm 1 hình học: cho lựa chọn hình khi thêm xxx
 * Sửa 1 hình học
 * Xóa 1 hình học tại vị trí index xxx
 * Sắp xếp các hình học tăng dần theo diện tích, theo màu, theo bán kính, theo tên xxx
 * Tính tổng diện tích của tất cả các hình xxx
 * Tính tổng diện tích của tất cả các hình có màu đỏ và đã được tô màu xxx
 * Tìm các hình học theo màu, theo trạng thái đã được tô hay chưa xxx
 */

public class ResizableTest {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[6];
        shapes[0] = new Circle(5,"Black",false);
        shapes[1] = new Rectangle(5, 10,"Grey",true);
        shapes[5] = new Rectangle(8, 12,"Red",true);
        shapes[2] = new Square(8,"Cyan",true);
        shapes[4] = new Square(19,"Red",true);
        shapes[3] = new Circle(5,"Purple",false);

        System.out.println("Resizing...");
        resizeShapesAndShow(shapes);

        System.out.println("Adding...");
        shapes = addShape(shapes,new Square(8,"Purple",true));
        showShapes(shapes);

        System.out.println("Removing...");
        shapes = removeShape(shapes,2);
        showShapes(shapes);

        System.out.println("Sorting...");
        sort(shapes);

        System.out.println("Summing...");
        sum(shapes);

        System.out.println("Searching...");
        searchShape(shapes,"red",true);
    }

    public static void resizeShapesAndShow(Shape[] shapes) {

        System.out.println("Pre-resized: ");
        showShapes(shapes);

        for (Shape shape : shapes) {
            double percent = (int) (Math.random() * 100 + 1);
            percent = percent / 100;
            shape.resize(percent);
        }

        System.out.println("After-resized: ");
        showShapes(shapes);
    }

    public static Shape[] addShape(Shape[] shapes, Shape shape) {
        Shape[] newShapes = new Shape[shapes.length + 1];
        for (int i = 0; i< shapes.length; i++){
            newShapes[i] = shapes[i];
        }
        newShapes[shapes.length] = shape;
        return newShapes;
    }
    public static Shape[] removeShape(Shape[] shapes, int index){
        if (index < 0 || index >= shapes.length)
            throw new IndexOutOfBoundsException("index: "+index);
        else {
            Shape[] newShapes = new Shape[shapes.length - 1];
            for (int i = 0, k = 0; i < shapes.length; i++){
                if (i == index)
                    continue;
                newShapes[k++] = shapes[i];
            }
            return newShapes;
        }
    }
    public static void showShapes(Shape[] shapes){
        for (Shape shape : shapes) {
            System.out.printf("Perimeter: %.1f Area: %.1f of %s %n",shape.getPerimeter(), shape.getArea(), shape);
        }
    }
    public static int sumAllArea(Shape[] shapes){
        int sum = 0;
        for (Shape shape: shapes){
            sum+=shape.getArea();
        }
        return sum;
    }
    public static int sumAreaRedFilled(Shape[] shapes){
        int sum = 0;
        for (Shape shape: shapes){
            if (shape.getColor().equalsIgnoreCase("red") && shape.isFilled())
                sum += shape.getArea();
        }
        return sum;
    }
    public static void searchShape(Shape[] shapes,String color, boolean filled){
        for (Shape shape: shapes){
            if (shape.getColor().equalsIgnoreCase(color) && shape.isFilled() == filled){
                System.out.println(shape);
            }
        }
    }
    public static void sort(Shape[] shapes){
        ShapesComparator areaComparator = new ShapesComparator(true);
        ShapesComparator perimeterComparator = new ShapesComparator(false);
        ColorOrNameComparator colorComparator = new ColorOrNameComparator(true);
        ColorOrNameComparator nameComparator = new ColorOrNameComparator(false);

        System.out.println("Before sort: ");
        showShapes(shapes);

        System.out.println("Sorting shapes by area...");
        Arrays.sort(shapes,areaComparator);
        showShapes(shapes);

        System.out.println("Sorting shapes by perimeter...");
        Arrays.sort(shapes,perimeterComparator);
        showShapes(shapes);

        System.out.println("Sorting shapes by color...");
        Arrays.sort(shapes,colorComparator);
        showShapes(shapes);

        System.out.println("Sorting shapes by name...");
        Arrays.sort(shapes,nameComparator);
        showShapes(shapes);
    }
    public static void sum(Shape[] shapes){
        showShapes(shapes);
        System.out.println(sumAllArea(shapes));
        System.out.println(sumAreaRedFilled(shapes));
    }
}
