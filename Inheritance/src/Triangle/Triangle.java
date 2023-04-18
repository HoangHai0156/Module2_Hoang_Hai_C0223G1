package Triangle;

public class Triangle extends Shape {
    private double side1 = 1;
    private double side2 = 1;
    private double side3 = 1;

    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(String color, boolean filled, double side1, double side2, double side3) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getPerimeter() {
        return getSide1() + getSide2() + getSide3();
    }

    public double getArea() {
        double p = getPerimeter() / 2;
        double h = 2 * (Math.sqrt(p * (p - getSide1()) * (p - getSide2()) * (p - getSide3()))) / getSide1();
        return h * getSide3() / 2;
    }

    @Override
    public String toString() {
        return String.format("A Triangle with side1 = %.2f, side2 = %.2f, side3 = %.2f, Perimeter = %.2f, Area = %.2f, which is subclass of %s"
                , getSide1(), getSide2(), getSide3(), getPerimeter(), getArea(), super.toString());
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle(2, 3, 4);
        System.out.printf(triangle.toString());
    }
}
