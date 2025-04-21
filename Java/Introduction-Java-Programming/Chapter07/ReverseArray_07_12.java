import java.util.Scanner;

public class ReverseArray_07_12 {
    public static void main(String[] args) {
        System.out.print("Please enter ten numbers: ");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        scanner.close();
        String[] inputChar = inputString.split(" ");
        double[] inputNumber = new double[inputChar.length];
        for (int i = 0; i < inputNumber.length; i++) {
            inputNumber[i] = Double.parseDouble(inputChar[i]);
        }
        reverse(inputNumber);
        System.out.print("The reversed numbers are: ");
        for (double v : inputNumber) {
            System.out.printf("%3.2f ", v);
        }
    }

    public static double[] reverse(double[] list) {

        for (int i = 0; i < list.length / 2; i++) {
            double temp = list[i];
            list[i] = list[list.length - 1 - i];
            list[list.length - 1 - i] = temp;
        }
        return list;
    }
}
