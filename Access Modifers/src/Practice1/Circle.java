package Practice1;

public class Circle {
    private double radius = 1.0;
    private String color = "red";
    public Circle(){

    }
    public Circle(double r, String colour){
        radius = r;
        color =colour;
    }

    double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }
    double getArea(){
        return 2*Math.PI*Math.pow(radius,2);
    }
}
