package resizable_interface;

public class Circle extends Shape {
    private double radius = 1;
    private final String name = "Circle";

    public String getName() {
        return name;
    }

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void resize(double percent) {
        radius += radius*percent;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}'+" of " +
                super.toString();
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        Circle circle1 = new Circle(2.5);
        System.out.println(circle1);

        Circle circle2 = new Circle(4.5,"Ivory",true);
        System.out.println(circle2);
    }
}
