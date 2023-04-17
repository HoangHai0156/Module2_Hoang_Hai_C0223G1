package ThucHanh2;

public class TestStaticProperty {
    public static void main(String[] args) {
        Car car = new Car("Mazda 3","Skyactiv 3");
//        System.out.println(Car.numberOfCars);
        System.out.println(Car.getNumberOfCars());
        Car car1 = new Car("Mazda 6","Skyactiv 6");
        System.out.println(Car.numberOfCars);
    }
}
