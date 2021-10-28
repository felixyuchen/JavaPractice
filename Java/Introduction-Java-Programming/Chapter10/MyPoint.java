public class MyPoint {
    private double x;
    private double y;

    public MyPoint() {
        x = 0;
        y = 0;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(MyPoint p) {
        return Math.sqrt(Math.pow((this.x - p.x), 2) + Math.pow((this.y - p.y), 2));
    }

    public double distance(double x, double y) {
        return Math.sqrt((Math.pow((this.x - x), 2) + Math.pow((this.y - y), 2)));
    }

    public double distance(MyPoint p1, MyPoint p2){
        return Math.sqrt(Math.pow((p1.x - p2.x), 2) + Math.pow((p1.y - p2.y), 2));
    }
}
