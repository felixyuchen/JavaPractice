public class Circle2D {
    private double x;
    private double y;
    private double radius;
    private final double Pi = 3.1415;


    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRadius() {
        return radius;
    }

    public Circle2D() {
        x = 0;
        y = 0;
        radius = 1;
    }

    public Circle2D(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getArea() {
        return Pi * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Pi * radius;
    }

    public boolean contains(double x, double y) {
        double distance = Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));
        return distance < this.radius;
    }

    public boolean contains(Circle2D circle) {
        double distance = Math.sqrt((circle.getX() - this.x) * (circle.getX() - this.x) + (circle.getY() - this.y) * (circle.getY() - this.y));
        return circle.getRadius() + distance < this.radius;
    }

    public boolean overlaps(Circle2D circle){
        double distance = Math.sqrt((circle.getX() - this.x) * (circle.getX() - this.x) + (circle.getY() - this.y) * (circle.getY() - this.y));
        return distance < circle.getRadius() + this.radius;
    }
}
