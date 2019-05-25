public class Circle extends Shape{
    private Point o;
    private Point r;

    public Circle(Point o, Point r) {
        this.o = o;
        this.r = r;
    }

    public Circle() {
    }

    public Point getO() {
        return o;
    }

    public void setO(Point o) {
        this.o = o;
    }

    public Point getR() {
        return r;
    }

    public void setR(Point r) {
        this.r = r;
    }

    @Override
    public double getPerimetr() {
        return 2 * Math.PI * Point.length(o, r);
    }

    @Override
    double getArea() {
        return Math.PI * Math.pow(Point.length(o, r), 2);
    }

    @Override
    public String toString() {
        return "Circle [" +
                "O" + o +
                ", R" + r +
                ']';
    }
}
