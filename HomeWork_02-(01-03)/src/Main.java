public class Main {
    public static void main(String[] args) {

        Circle cir = new Circle(new Point(0.0, 2.0), new Point(4.0, 5.0));

        System.out.println(cir);
        System.out.println("Perimetr (cm) = " + cir.getPerimetr());
        System.out.println("Area (cm2) = " + cir.getArea());
        System.out.println();

        Triangle tngl = new Triangle(new Point(2, 4), new Point(-2.0, 5.0), new Point(-1.0, -6.0));

        System.out.println(tngl);
        System.out.println("Perimetr (cm) = " + tngl.getPerimetr());
        System.out.println("Area (cm2) = " + tngl.getArea());
        System.out.println();

        Rectangle rect = new Rectangle(new Point(2, 4), new Point(-2.0, 5.0), new Point(-1.0, -6.0), new Point(-1.0, -6.0));

        System.out.println(rect);
        System.out.println("Perimetr (cm) = " + rect.getPerimetr());
        System.out.println("Area (cm2) = " + rect.getArea());
        System.out.println();


    }
}
