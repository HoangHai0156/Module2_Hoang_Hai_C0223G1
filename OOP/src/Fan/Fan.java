package Fan;

public class Fan {
    private int speed = 1;
    private boolean on;
    private double radius = 5;
    private String color = "blue";

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setSpeed(int speed) {
        if (speed >= 1 && speed <= 3) {
            this.speed = speed;
        }
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean getOn() {
        return this.on;
    }

    public int getSpeed() {
        return this.speed;
    }

    public double getRadius() {
        return this.radius;
    }

    public String getColor() {
        return this.color;
    }

    @Override
    public String toString() {
        if (this.on) {
            return "Fan is on. Radius: " + getRadius() + " Color: " + getColor() + " Speed: " + getSpeed();
        } else {
            return "Fan is off. Radius: " + getRadius() + " Color: " + getColor();
        }
    }
}
