import java.util.Scanner;

public class TriangleClass_11_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter side1 of a triangle: ");
        double side1 = scanner.nextDouble();
        System.out.print("Please enter side2 of a triangle: ");
        double side2 = scanner.nextDouble();
        System.out.print("Please enter side3 of a triangle: ");
        double side3 = scanner.nextDouble();
        Triangle triangle = new Triangle(side1, side2, side3);
        System.out.print("Please enter the color of the triangle: ");
        String color = scanner.next();
        triangle.setColor(color);
        System.out.print("Is the triangle filled with the color? ");
        boolean filled = scanner.nextBoolean();
        triangle.setFilled(filled);
        System.out.printf("%s. The area is %4.2f and the perimeter is %4.2f.%n",triangle.toString(),triangle.getArea(),triangle.getPerimeter());
        System.out.printf("The color is %s and it's filled %b.",triangle.getColor(),triangle.isFilled());
        double si = Math.pow(4,3) * 4;
    }
}
