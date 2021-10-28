public class Circle2DClass_10_11 {
    public static void main(String[] args) {
        Circle2D c1 = new Circle2D(2,2,5.5);
        Circle2D c2 = new Circle2D(4,5,10.5);
        Circle2D c3 = new Circle2D(3,5,2.3);
        System.out.printf("The area is %4.2f and the perimeter is %4.2f.%n",c1.getArea(),c1.getPerimeter());
        if(c1.contains(3,3))
            System.out.println("The point is inside this circle.");
        else
            System.out.println("The point is not inside this circle.");

        if (c1.contains(c2))
            System.out.println("The circle is inside this circle.");
        else
            System.out.println("The circle is not inside this circle.");

        if(c1.overlaps(c3))
            System.out.println("The circle overlaps with this circle.");
        else
            System.out.println("The circle does not overlap with this circle.");
    }
}
