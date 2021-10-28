import java.util.Scanner;

public class SortThreeNumbers_6_5 {
    public static void main(String[] args) {
        double number1, number2, number3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter three number below --");
        System.out.print("Please enter the first number:");
        number1 = scanner.nextDouble();
        System.out.print("Please enter the second number:");
        number2 = scanner.nextDouble();
        System.out.print("Please enter the third number:");
        number3 = scanner.nextDouble();
        displaySortedNumbers(number1, number2, number3);
        scanner.close();
    }

    public static void displaySortedNumbers(double num1, double num2, double num3) {
//        double minNumber = num1;
        if (num1 > num2) {
            double temNumber = num2;
            num2 = num1;
            num1 = temNumber;
        }
        if (num1 > num3) {
            double temNumber = num3;
            num3 = num1;
            num1 = temNumber;
        }
        if (num2 > num3) {
            double temNumber = num3;
            num3 = num2;
            num2 = temNumber;
        }
        System.out.println("The number in increasing order:" + num1 + ", " + num2 + ", " + num3);
    }
}
