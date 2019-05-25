public class Triangle extends Shape{
    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle() {
    }

    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public Point getB() {
        return b;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public Point getC() {
        return c;
    }

    public void setC(Point c) {
        this.c = c;
    }

    @Override
    double getPerimetr(){
        return Point.length(a, b) + Point.length(b, c) + Point.length(a, c);
    }

    @Override
    double getArea(){
        double polP=getPerimetr()/2;
        return Math.sqrt(polP*(polP-Point.length(a, b))*(polP-Point.length(b, c))*(polP-Point.length(a, c)));
    }

    @Override
    public String toString() {
        return "Triangle [" +
                "A" + a +
                ", B" + b +
                ", C" + c +
                ']';
    }
}
