public class IllegalTriangleException extends Exception {
    private double side1;
    private double side2;
    private double side3;

    public IllegalTriangleException(String message) {
        super("Invalid 3 sides.");

    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }
}
