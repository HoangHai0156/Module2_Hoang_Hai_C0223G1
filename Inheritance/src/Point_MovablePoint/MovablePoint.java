package Point_MovablePoint;

public class MovablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MovablePoint() {
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        setxSpeed(xSpeed);
        setySpeed(ySpeed);
    }

    public float[] getSpeed() {
        float[] arr = {getxSpeed(), getySpeed()};
        return arr;
    }

    @Override
    public String toString() {
        return String.format("%s, speed = (%f, %f)%n", super.toString(), getxSpeed(), getySpeed());
    }

    public MovablePoint move() {
        float x = getX();
        float y = getY();
        x += getxSpeed();
        y += getySpeed();
        setXY(x,y);
        return this; // Trả về đối tượng đang gọi phương thức move() với x,y mới được cộng dồn speed.
    }

    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint();
        System.out.printf(movablePoint.toString());

        MovablePoint movablePoint1 = new MovablePoint(2,3,1,1);
        System.out.printf(movablePoint1.toString());
        System.out.printf(movablePoint1.move().toString());
    }
}
