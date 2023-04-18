package ThucHanh1;

public class Square extends Rectangle{
    public Square(){
        super(1,1);
    }
    public Square(double side){
        super(side,side);
    }
    public Square(double side, String color, boolean filled){
        super(side,side,color,filled);
    }
    public double getSide(){
        return getWidth();
    }
    public void setSide(double side){
        setWidth(side);
        setLength(side);
    }
    public void setWidth(double side){
        setSide(side);
    }
    public void setLength(double side){
        setSide(side);
    }

    @Override
    public String toString() {
        return String.format("A Square with side=%f, which is a subclass of %s %n", getSide(), super.toString());
    }

    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);

        Square square1 = new Square(2.5);
        System.out.println(square1);

        Square square2 = new Square(3.5,"Walnut",false);
        System.out.println(square2);
    }
}
