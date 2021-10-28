import java.util.Scanner;

public class AverageArray_07_08 {

    public static void main(String[] args) {
        System.out.print("Enter double numbers: ");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        scanner.close();
        String[] inputChar = inputString.split(" ");
        double[] inputNumber = new double[inputChar.length];
        for (int i =0; i < inputChar.length;i++){
            inputNumber[i] = Double.parseDouble(inputChar[i]);
        }
        double averageAmount = average(inputNumber);
        System.out.printf("The average amount is: %6.4f",averageAmount);
    }

    public static int average(int[] array) {
        int totalValue = 0;
        for (int j : array) {
            totalValue += j;
        }
        return totalValue / array.length;
    }

    public static double average(double[] array) {
        double totalValue = 0D;
        for (double v : array) {
            totalValue += v;
        }
        return totalValue / array.length;
    }
}
