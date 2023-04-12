package rectangleClass;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Rectangle {
    double width = 1.2;
    double height = 0.6;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        double area = this.width * this.height;
        return area;
    }

    public double getPerimeter() {
        double perimeter = (this.width + this.height) * 2;
        return perimeter;
    }

    public void display() {
        System.out.printf("HCN co chieu dai la %.2f va chieu rong la %.2f %n", this.width, this.height);
    }
}

