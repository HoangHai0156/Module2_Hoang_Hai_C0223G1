package colorable_interface;

public class Square extends Shape implements Colorable{
    private double side = 1;

    public Square(){}

    public Square(double side) {
        this.side = side;
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea(){
        return Math.pow(side,2);
    }

    public double getPerimeter(){
        return 4*side;
    }

    @Override
    public String howToColor() {
        return "Square: Color all four sides";
    }

    @Override
    public String toString() {
        return String.format("A Square with side=%.2f, which is a subclass of %s", getSide(), super.toString());
    }
}
