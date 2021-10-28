public class Triangle2D {
    private MyPoint p1;
    private MyPoint p2;
    private MyPoint p3;

    public MyPoint getP1() {
        return p1;
    }

    public MyPoint getP2() {
        return p2;
    }

    public MyPoint getP3() {
        return p3;
    }

    public void setP1(MyPoint p1) {
        this.p1 = p1;
    }

    public void setP2(MyPoint p2) {
        this.p2 = p2;
    }

    public void setP3(MyPoint p3) {
        this.p3 = p3;
    }

    public Triangle2D() {
        p1 = new MyPoint(0, 0);
        p2 = new MyPoint(1, 1);
        p3 = new MyPoint(2, 5);
    }

    public Triangle2D(MyPoint p1, MyPoint p2, MyPoint p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public double getArea() {
        double distance1 = p1.distance(p2);
        double distance2 = p1.distance(p3);
        double distance3 = p2.distance(p3);
        double s = (distance1 + distance2 + distance3) / 2;
        return (double) Math.round(Math.sqrt(s * (s - distance1) * (s - distance2) * (s - distance3)) * 100) / 100;
    }

    public double getPerimeter() {
        //MyPoint getDistance = new MyPoint();
        double distance1 = p1.distance(p2);
        double distance2 = p1.distance(p3);
        double distance3 = p2.distance(p3);
        return distance1 + distance2 + distance3;
    }

    public boolean contains(MyPoint p) {
        Triangle2D triangle0 = new Triangle2D(p1, p2, p3);
        Triangle2D triangle1 = new Triangle2D(p1, p2, p);
        Triangle2D triangle2 = new Triangle2D(p1, p3, p);
        Triangle2D triangle3 = new Triangle2D(p2, p3, p);
        double area0 = triangle0.getArea();
        double area1 = triangle1.getArea();
        double area2 = triangle2.getArea();
        double area3 = triangle3.getArea();
        return area0 == area1 + area2 + area3;
    }

    public boolean contains(Triangle2D t) {
        return contains(t.p1) && contains(t.p2) && contains(t.p3);
    }

}
