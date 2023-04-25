package resizable_interface;

public class Square extends Shape implements Resizable{
    private final String name = "Square";

    public String getName() {
        return name;
    }

    private double side = 1;

    public Square(){}

    public Square(double side) {
        this.side = side;
    }

    public Square(double side, String color, boolean filled) {
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
    public void resize(double percent) {
        side += side*percent;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}'+" of " +
                super.toString();
    }
}
