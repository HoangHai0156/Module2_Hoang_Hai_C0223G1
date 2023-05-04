package use_IllegalTriangleException;

public class Triangle {
    private double side1;
    private double side2;
    private double side3;
    public Triangle(double side1, double side2, double side3) throws IllegalTriangleException{
        if (side1 < 0 || side2 < 0 || side3 < 0){
            throw new IllegalTriangleException("Canh khong duoc phep be hon khong");
        }else {
            if ((side1 + side2 <= side3)||(side1 + side3 <= side2)||(side3 + side2 <= side1)){
                throw new IllegalTriangleException("3 canh tam giac khong hop le");
            }
        }
    }
}
