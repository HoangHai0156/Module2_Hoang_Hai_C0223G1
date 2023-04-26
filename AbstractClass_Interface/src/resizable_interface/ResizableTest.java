package resizable_interface;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Thêm 1 hình học: cho lựa chọn hình khi thêm xxx
 * Sửa 1 hình học
 * Xóa 1 hình học tại vị trí index xxx
 * Sắp xếp các hình học tăng dần theo diện tích, theo màu, theo bán kính, theo tên xxx
 * Tính tổng diện tích của tất cả các hình xxx
 * Tính tổng diện tích của tất cả các hình có màu đỏ và đã được tô màu xxx
 * Tìm các hình học theo màu, theo trạng thái đã được tô hay chưa xxx
 */

public class ResizableTest {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Shape[] shapes = new Shape[6];
        shapes[0] = new Circle(5, "Black", false);
        shapes[1] = new Rectangle(5, 10, "Grey", true);
        shapes[5] = new Rectangle(8, 12, "Red", true);
        shapes[2] = new Triangle("RED", true, 4, 5, 7);
        shapes[4] = new Square(19, "Red", true);
        shapes[3] = new Circle(5, "Purple", false);


        showShapes(shapes);
        System.out.println("Sua 1 hinh");
        fixShape(shapes);
        System.out.println("Sau khi sua");
        showShapes(shapes);


        /**
         showShapes(shapes);
         System.out.println("Adding...");

         int choosen = 1;
         Shape shape;        // null
         switch (choosen) {
         case 1: // hinh vuong
         shape =  new Square(8,"Purple",true);
         shapes = addShape(shapes,shape);
         break;
         case 2:
         // Nhap dai, rong
         shape = new Rectangle(4, 5);
         shapes = addShape(shapes,shape);
         break;
         }
         showShapes(shapes);

         System.out.println("Searching...");
         searchShape(shapes,"red",true);


         System.out.println("Summing...");
         sum(shapes);
         **/
        /**
         System.out.println("Resizing...");
         resizeShapesAndShow(shapes);
         System.out.println("Removing...");
         shapes = removeShape(shapes,2);
         showShapes(shapes);

         System.out.println("Sorting...");
         sort(shapes);

         System.out.println("Summing...");
         sum(shapes);

         System.out.println("Searching...");
         searchShape(shapes,"red",true);
         **/
    }

    public static void resizeShapesAndShow(Shape[] shapes) {

        System.out.println("Pre-resized: ");
        showShapes(shapes);

        for (Shape shape : shapes) {
            double percent = (int) (Math.random() * 100 + 1);
            percent = percent / 100;
            shape.resize(percent);
        }

        System.out.println("After-resized: ");
        showShapes(shapes);
    }

    public static Shape[] addShape(Shape[] shapes, Shape shape) {
        Shape[] newShapes = new Shape[shapes.length + 1];
        System.arraycopy(shapes, 0, newShapes, 0, shapes.length);
        newShapes[shapes.length] = shape;
        return newShapes;
    }

    public static Shape[] removeShape(Shape[] shapes, int index) {
        if (index < 0 || index >= shapes.length)
            throw new IndexOutOfBoundsException("index: " + index);
        else {
            Shape[] newShapes = new Shape[shapes.length - 1];
            for (int i = 0, k = 0; i < shapes.length; i++) {
                if (i == index)
                    continue;
                newShapes[k++] = shapes[i];
            }
            return newShapes;
        }
    }

    public static void showShapes(Shape[] shapes) {
        for (Shape shape : shapes) {
            System.out.printf("Perimeter: %.1f Area: %.1f of %s %n", shape.getPerimeter(), shape.getArea(), shape);
        }
    }

    public static int sumAllArea(Shape[] shapes) {
        int sum = 0;
        for (Shape shape : shapes) {
            sum += shape.getArea();
        }
        return sum;
    }

    public static int sumAreaRedFilled(Shape[] shapes) {
        int sum = 0;
        for (Shape shape : shapes) {
            if (shape.getColor().equalsIgnoreCase("red") && shape.isFilled())
                sum += shape.getArea();
        }
        return sum;
    }

    public static void searchShape(Shape[] shapes, String color, boolean filled) {
        for (Shape shape : shapes) {
            if (shape.getColor().equalsIgnoreCase(color) && shape.isFilled() == filled) {
                System.out.println(shape);
            }
        }
    }

    public static void sort(Shape[] shapes) {
        ShapesComparator areaComparator = new ShapesComparator(true);
        ShapesComparator perimeterComparator = new ShapesComparator(false);
        ColorOrNameComparator colorComparator = new ColorOrNameComparator(true);
        ColorOrNameComparator nameComparator = new ColorOrNameComparator(false);

        System.out.println("Before sort: ");
        showShapes(shapes);

        System.out.println("Sorting shapes by area...");
        Arrays.sort(shapes, areaComparator);
        showShapes(shapes);

        System.out.println("Sorting shapes by perimeter...");
        Arrays.sort(shapes, perimeterComparator);
        showShapes(shapes);

        System.out.println("Sorting shapes by color...");
        Arrays.sort(shapes, colorComparator);
        showShapes(shapes);

        System.out.println("Sorting shapes by name...");
        Arrays.sort(shapes, nameComparator);
        showShapes(shapes);
    }

    public static void sum(Shape[] shapes) {
        showShapes(shapes);
        System.out.println(sumAllArea(shapes));
        System.out.println(sumAreaRedFilled(shapes));
    }

    public static void fixShape(Shape[] shapes) {
        int index;
        do {
            System.out.println("Chon vi tri cua hinh muon sua");
            index = Integer.parseInt(scanner.nextLine());
        } while (index < 0 || index >= shapes.length);
        int action;
        do {
            do {
                System.out.println("1. Chinh sua hinh cu");
                System.out.println("2. Thay the hinh cu bang hinh moi");
                System.out.println("0. Exit");
                action = Integer.parseInt(scanner.nextLine());
            } while (action < 0 || action > 2);
            switch (action) {
                case 1 -> {
                    switch (shapes[index].getName()) {
                        case "Circle" -> fixCircle((Circle) shapes[index]);
                        case "Rectangle" -> fixRectangle((Rectangle) shapes[index]);
                        case "Square" -> fixSquare((Square) shapes[index]);
                        case "Triangle" -> fixTriangle((Triangle) shapes[index]);
                    }
                }
                case 2 -> {
                    switch (shapes[index].getName()) {
                        case "Circle" -> replaceCircle(shapes, index);
                        case "Rectangle" -> replaceRectangle(shapes, index);
                        case "Square" -> replaceSquare(shapes, index);
                        case "Triangle" -> replaceTriangle(shapes, index);
                    }
                }
                default -> {
                }
            }
        } while (action != 0);
    }

    public static void fixCircle(Circle circle) {
        int action;
        do {
            do {
                System.out.println("1. Thay doi radius");
                System.out.println("2. Thay doi color");
                System.out.println("3. Thay doi filled");
                System.out.println("0. Exit");
                action = Integer.parseInt(scanner.nextLine());
            } while (action < 0 || action > 3);
            switch (action) {
                case 1 -> {
                    System.out.println("Cho radius muon thay the");
                    double radius = Double.parseDouble(scanner.nextLine());
                    circle.setRadius(radius);
                }
                case 2 -> setColor(circle);
                case 3 -> setFilled(circle);
                default -> {
                }
            }
        } while (action != 0);
    }

    public static void fixRectangle(Rectangle rectangle) {
        int action;
        do {
            do {
                System.out.println("1. Thay doi width");
                System.out.println("2. Thay doi length");
                System.out.println("3. Thay doi color");
                System.out.println("4. Thay doi filled");
                System.out.println("0. Exit");
                action = Integer.parseInt(scanner.nextLine());
            } while (action < 0 || action > 4);
            switch (action) {
                case 1 -> {
                    System.out.println("Cho width muon thay the");
                    double width = Double.parseDouble(scanner.nextLine());
                    rectangle.setWidth(width);
                }
                case 2 -> {
                    System.out.println("Cho length muon thay the");
                    double length = Double.parseDouble(scanner.nextLine());
                    rectangle.setLength(length);
                }
                case 3 -> setColor(rectangle);
                case 4 -> setFilled(rectangle);
                default -> {
                }
            }
        } while (action != 0);
    }

    public static void fixSquare(Square square) {
        int action;
        do {
            do {
                System.out.println("1. Thay doi side");
                System.out.println("2. Thay doi color");
                System.out.println("3. Thay doi filled");
                System.out.println("0. Exit");
                action = Integer.parseInt(scanner.nextLine());
            } while (action < 0 || action > 3);
            switch (action) {
                case 1 -> {
                    System.out.println("Cho side muon thay the");
                    double side = Double.parseDouble(scanner.nextLine());
                    square.setSide(side);
                }
                case 2 -> setColor(square);
                case 3 -> setFilled(square);
                default -> {
                }
            }
        } while (action != 0);
    }

    public static void fixTriangle(Triangle triangle) {
        int action;
        double side1 = triangle.getSide1();
        double side2 = triangle.getSide2();
        double side3 = triangle.getSide3();
        do {
            do {
                System.out.println("1. Thay doi side1");
                System.out.println("2. Thay doi side2");
                System.out.println("3. Thay doi side3");
                System.out.println("4. Thay doi color");
                System.out.println("5. Thay doi filled");
                System.out.println("0. Exit");
                action = Integer.parseInt(scanner.nextLine());
            } while (action < 0 || action > 5);
            switch (action) {
                case 1 -> {
                    do {
                        System.out.println("Cho side1 muon thay the");
                        side1 = Double.parseDouble(scanner.nextLine());
                    } while (!isTriangle(side1, side2, side3));
                    triangle.setSide1(side1);
                }
                case 2 -> {
                    do {
                        System.out.println("Cho side2 muon thay the");
                        side2 = Double.parseDouble(scanner.nextLine());
                    } while (!isTriangle(side1, side2, side3));
                    triangle.setSide2(side2);
                }
                case 3 -> {
                    do {
                        System.out.println("Cho side3 muon thay the");
                        side3 = Double.parseDouble(scanner.nextLine());
                    } while (!isTriangle(side1, side2, side3));
                    triangle.setSide3(side3);
                }
                case 4 -> setColor(triangle);
                case 5 -> setFilled(triangle);
                default -> {
                }
            }
        } while (action != 0);
    }

    private static void setColor(Shape shape) {
        System.out.println("Cho mau muon thay the");
        String color = scanner.nextLine();
        shape.setColor(color);
    }

    public static void setFilled(Shape shape) {
        char confirm;
        do {
            System.out.println("Chon filled hay khong (Y/N)");
            confirm = scanner.nextLine().charAt(0);
        } while (confirm != 'y' && confirm != 'Y' && confirm != 'n' && confirm != 'N');
        shape.setFilled(confirm == 'y' || confirm == 'Y');
    }

    private static boolean isFilled() {
        char confirm;
        do {
            System.out.println("Chon filled hay khong (Y/N)");
            confirm = scanner.nextLine().charAt(0);
        } while (confirm != 'y' && confirm != 'Y' && confirm != 'n' && confirm != 'N');
        return (confirm == 'y' || confirm == 'Y');
    }

    public static boolean isTriangle(double side1, double side2, double side3) {
        if ((side1 + side2 <= side3) || (side1 + side3 <= side2) || (side3 + side2 <= side1))
            return false;
        return true;
    }

    public static void createMenuShapes(Shape shape, Set<String> shapeSet) {
        int i = 1;
        for (String set : shapeSet) {
            if (shape.getName().equals(set))
                continue;
            System.out.println(i + ". Thay hinh thanh " + set);
            i++;
        }
    }

    public static void replaceCircle(Shape[] shapes, int index) {
        int type;
        do {
            System.out.println("Chon hinh muon thay the");
            System.out.println("1. Thay hinh thanh Rectangle");
            System.out.println("2. Thay hinh thanh Triangle");
            System.out.println("3. Thay hinh thanh Square");
            System.out.println("0. Exit");
            type = Integer.parseInt(scanner.nextLine());
        } while (type < 0 || type > 3);
        switch (type) {
            case 1 -> shapes[index] = createNewRectangle();
            case 2 -> shapes[index] = createNewTriangle();
            case 3 -> shapes[index] = createNewSquare();
            default -> {
            }
        }
    }

    public static void replaceRectangle(Shape[] shapes, int index) {
        int type;
        do {
            System.out.println("Chon hinh muon thay the");
            System.out.println("1. Thay hinh thanh Circle");
            System.out.println("2. Thay hinh thanh Triangle");
            System.out.println("3. Thay hinh thanh Square");
            System.out.println("0. Exit");
            type = Integer.parseInt(scanner.nextLine());
        } while (type < 0 || type > 3);
        switch (type) {
            case 1 -> shapes[index] = createNewCircle();
            case 2 -> shapes[index] = createNewTriangle();
            case 3 -> shapes[index] = createNewSquare();
            default -> {
            }
        }
    }

    public static void replaceSquare(Shape[] shapes, int index) {
        int type;
        do {
            System.out.println("Chon hinh muon thay the");
            System.out.println("1. Thay hinh thanh Rectangle");
            System.out.println("2. Thay hinh thanh Triangle");
            System.out.println("3. Thay hinh thanh Circle");
            System.out.println("0. Exit");
            type = Integer.parseInt(scanner.nextLine());
        } while (type < 0 || type > 3);
        switch (type) {
            case 1 -> shapes[index] = createNewRectangle();
            case 2 -> shapes[index] = createNewTriangle();
            case 3 -> shapes[index] = createNewCircle();
            default -> {
            }
        }
    }

    public static void replaceTriangle(Shape[] shapes, int index) {
        int type;
        do {
            System.out.println("Chon hinh muon thay the");
            System.out.println("1. Thay hinh thanh Rectangle");
            System.out.println("2. Thay hinh thanh Circle");
            System.out.println("3. Thay hinh thanh Square");
            System.out.println("0. Exit");
            type = Integer.parseInt(scanner.nextLine());
        } while (type < 0 || type > 3);
        switch (type) {
            case 1 -> shapes[index] = createNewRectangle();
            case 2 -> shapes[index] = createNewCircle();
            case 3 -> shapes[index] = createNewSquare();
            default -> {
            }
        }
    }

    public static Triangle createNewTriangle() {
        double side1, side2, side3;
        do {
            System.out.println("Nhap vao side1 cua Triangle");
            side1 = Double.parseDouble(scanner.nextLine());
            System.out.println("Nhap vao side2 cua Triangle");
            side2 = Double.parseDouble(scanner.nextLine());
            System.out.println("Nhap vao side3 cua Triangle");
            side3 = Double.parseDouble(scanner.nextLine());
        } while (!isTriangle(side1, side2, side3));
        System.out.println("Nhap vao mau cua Triangle");
        String color = scanner.nextLine();
        boolean filled = isFilled();
        return new Triangle(color, filled, side1, side2, side3);
    }

    public static Square createNewSquare() {
        double side;
        System.out.println("Nhap vao canh cua hinh vuong");
        side = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhap vao mau cua Square");
        String color = scanner.nextLine();
        boolean filled = isFilled();
        return new Square(side, color, filled);
    }

    public static Rectangle createNewRectangle() {
        double width, length;
        System.out.println("Nhap vao width cua Rectangle");
        width = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhap vao length cua Rectangle");
        length = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhap vao mau cua Rectangle");
        String color = scanner.nextLine();
        boolean filled = isFilled();
        return new Rectangle(width, length, color, filled);
    }

    public static Circle createNewCircle() {
        double radius;
        System.out.println("Nhap vao radius cua hinh tron");
        radius = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhap vao mau cua Circle");
        String color = scanner.nextLine();
        boolean filled = isFilled();
        return new Circle(radius, color, filled);
    }
}
