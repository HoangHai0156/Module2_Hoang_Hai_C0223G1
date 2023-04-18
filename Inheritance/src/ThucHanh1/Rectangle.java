package ThucHanh1;

public class Rectangle extends Shape {
    private double width = 1;
    private double length = 1;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return (width + length) * 2;
    }

    @Override
    public String toString() {
        return String.format("A Rectangle with width=%f and length=%f, which is a subclass of %s %n", width, length, super.toString());
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        Rectangle rectangle1 = new Rectangle(3.5,6.5);
        System.out.println(rectangle1);

        Rectangle rectangle2 = new Rectangle(4.5,8.5,"Purple",false);
        System.out.println(rectangle2);
    }
}
