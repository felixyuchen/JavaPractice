class Triangle extends GeometricObject {
    private final double side1;
    private final double side2;
    private final double side3;


    public Triangle() {
        super();
        side1 = 1.0;
        side2 = 1.0;
        side3 = 1.0;
    }

    public Triangle(double side1, double side2, double side3)
    {
        super();
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
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

    public double getArea() {
        double p = (this.side1 + this.side2 + this.side3) / 2;
        return Math.sqrt(p * (p - this.side1) * (p - this.side2) * (p - this.side3));
    }

    public double getPerimeter(){
        return this.side1 + this.side2 + this.side3;
    }

    @Override
    public String toString(){
        return "Triangle: side1 = " + side1 + ", side 2 = " + side2 + ", side 3 = " + side3;
    }
}
