import java.util.Scanner;

public class SmallestElement_07_09 {
    public static void main(String[] args) {
        System.out.print("Please enter 10 double numbers: ");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        String[] inputChar = inputString.split(" ");
        scanner.close();
        double min;
        double[] inputDouble = new double[inputChar.length];
        for (int i = 0; i < inputDouble.length; i++) {
            inputDouble[i] = Double.parseDouble(inputChar[i]);
        }
        min = min(inputDouble);
        System.out.printf("The minimum number is: %6.2f", min);
    }

    public static double min(double[] array) {
        double min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }
}
