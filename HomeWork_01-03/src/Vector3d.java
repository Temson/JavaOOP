public class Vector3d {
    private double x;
    private double y;
    private double z;

    public Vector3d(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector3d() {
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public static double scalarMulti(Vector3d a, Vector3d b){
        return a.x * b.x + a.y * b.y + a.z * b.z;
    }

    public static Vector3d vectorMulti(Vector3d a, Vector3d b){
        double xv = a.y * b.z - a.z * b.y;
        double yv = a.z * b.x - a.x * b.z;
        double zv = a.x * b.y - a.y * b.x;
        return new Vector3d(xv, yv, zv);
    }

    public static Vector3d plus (Vector3d a, Vector3d b){
        return new Vector3d(a.x + b.x, a.y+ b.y, a.z + b.z);
    }

    @Override
    public String toString() {
        return "[" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                ']';
    }
}
