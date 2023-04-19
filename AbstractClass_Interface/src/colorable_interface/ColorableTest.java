package colorable_interface;

public class ColorableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(4);
        shapes[1] = new Rectangle(5,7);
        shapes[2] = new Square(5);

        for (Shape shape: shapes){
            System.out.println(shape.getArea());
            if(shape instanceof Colorable){
                System.out.println(((Colorable) shape).howToColor());
            }
        }
    }
}
