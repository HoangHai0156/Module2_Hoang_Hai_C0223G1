package ThucHanh2;

public class Car {
    private String name;
    private String engine;
    public static int numberOfCars;
    public Car(String n, String eng){
        name = n;
        engine = eng;
        numberOfCars++;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setEngine(String engine){
        this.engine = engine;
    }

    public String getName() {
        return name;
    }

    public String getEngine() {
        return engine;
    }

    public static int getNumberOfCars() {
        return numberOfCars;
    }
}
