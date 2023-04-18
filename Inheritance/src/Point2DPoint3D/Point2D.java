package Point2DPoint3D;

public class Point2D {
    private float x = 0.0f;
    private float y = 0.0f;
    public Point2D(){}
    public Point2D(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y){
        setX(x);
        setY(y);
    }
    public float[] getXY(){
        float[] arr = {this.x, this.y};
        return arr;
    }

    @Override
    public String toString() {
        return String.format("(%f, %f)%n",this.x, this.y);
    }

    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        System.out.printf(point2D.toString());
    }
}
