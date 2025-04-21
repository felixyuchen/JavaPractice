import java.util.Scanner;

public class MyTriangle_6_19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter side1:");
        double side1 = scanner.nextDouble();
        System.out.print("Please enter side2:");
        double side2 = scanner.nextDouble();
        System.out.print("Please enter side3:");
        double side3 = scanner.nextDouble();
        scanner.close();
//        System.out.printf("%f%f%f",side1,side2,side3);
        double area;
        if (isValid(side1, side2, side3)) {
            area = area(side1, side2, side3);
            System.out.println("The triangle area is " + area + ".");
        } else {
            System.out.println("This is invalid triangle.");
        }
    }

    public static boolean isValid(double side1, double side2, double side3) {
        boolean isTriangle;
        isTriangle = (side1 + side2) > side3 && (side1 + side3) > side2 && (side2 + side3) > side1;
        return isTriangle;
    }

    public static double area(double side1, double side2, double side3) {
        double area, s;
        s = (side1 + side2 + side3) / 2;
        area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        return area;
    }
}
