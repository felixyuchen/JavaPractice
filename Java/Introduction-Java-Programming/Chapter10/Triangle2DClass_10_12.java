public class Triangle2DClass_10_12 {
    public static void main(String[] args) {
        Triangle2D t1 = new Triangle2D(new MyPoint(2.5,2), new MyPoint(4.2,3), new MyPoint(5, 3.5));
        System.out.printf("The area is %4.2f and the perimeter is %4.2f.%n",t1.getArea(),t1.getPerimeter());
        MyPoint p = new MyPoint(3,3);
        if(t1.contains(p))
            System.out.println("The point is inside the triangle.");
        else
            System.out.println("The point is not inside the triangle.");

        if( t1.contains(new Triangle2D(new MyPoint(2.9, 2), new MyPoint(4, 1), new MyPoint(1, 3.4))))
            System.out.println("The triangle is inside.");
        else
            System.out.println("The triangle is not inside.");
    }
}
