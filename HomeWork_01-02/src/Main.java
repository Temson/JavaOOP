public class Main {
    public static void main(String[] args) {

        Triangle tr1 = new Triangle(6, 7, 4);
        System.out.println(tr1.toString());
        System.out.println("Square = " + tr1.square());
        System.out.println();

        Triangle tr2 = new Triangle(5, 4, 3);
        System.out.println(tr2.toString());
        System.out.println("Square = " + tr2.square());
        System.out.println();

        Triangle tr3 = new Triangle(10, 5, 8);
        System.out.println(tr3.toString());
        System.out.println("Square = " + tr3.square());
        System.out.println();

    }
}
