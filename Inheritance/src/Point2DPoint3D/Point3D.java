package Point2DPoint3D;

public class Point3D extends Point2D{
    private float z = 0.0f;
    public Point3D(){}
    public Point3D(float x, float y, float z){
        super(x,y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public float[] getXYZ(){
        float[] arr = {getX(), getY(), getZ()};
        return arr;
    }
    public void setXYZ(float x, float y, float z){
        setXY(x,y);
        setZ(z);
    }

    @Override
    public String toString() {
        return String.format("(%f, %f, %f)%n",getX(), getY(), getZ());
    }

    public static void main(String[] args) {
        Point3D point3D = new Point3D();
        System.out.printf(point3D.toString());

        Point3D point3D1 = new Point3D(1,2,3);
        System.out.printf(point3D1.toString());
    }
}
