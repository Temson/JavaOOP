public class Main {
    public static void main(String[] args) {
        Vector3d a  = new Vector3d(2, 4, 6);
        Vector3d b  = new Vector3d(4, 5, 6);

        System.out.println("Vector a "+ a);
        System.out.println("Vector b "+ b);
        System.out.println("Scalar multiplication result: " + Vector3d.scalarMulti(a, b));
        System.out.println("Vector multiplication result: " + Vector3d.vectorMulti(a, b).toString());
        System.out.println("Sum of vectors: " + Vector3d.plus(a, b).toString());

    }

}
