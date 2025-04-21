public class MyPointClass_10_04 {
    public static void main(String[] args) {
        MyPoint myPoint1 = new MyPoint();
        MyPoint myPoint2 = new MyPoint(10, 30.5);
        System.out.printf("The value of x is %2.2f and y is %2.2f.%n",myPoint1.getX(),myPoint1.getY());
        System.out.printf("The distance is %2.2f.%n",myPoint1.distance(myPoint2));
        System.out.printf("The distance is %2.2f.%n",myPoint1.distance(2,2));
    }
}
