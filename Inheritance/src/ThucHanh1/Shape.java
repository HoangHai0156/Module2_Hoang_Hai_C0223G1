package ThucHanh1;

public class Shape {
    private String color = "green";
    private boolean filled = true;

    public Shape() {

    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String toString() {
        return String.format("A Shape with color of %s and %s %n", this.color, this.filled ? "filled" : "not filled");
    }

    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);

        Shape shape1 = new Shape("Red", false);
        System.out.println(shape1);
    }
}
