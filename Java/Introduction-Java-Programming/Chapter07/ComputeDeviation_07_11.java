import java.util.Scanner;

public class ComputeDeviation_07_11 {
    public static void main(String[] args) {
        System.out.print("Enter ten numbers: ");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        scanner.close();
        String[] inputChar = inputString.split(" ");
        double[] inputDouble = new double[inputChar.length];
        for (int i =0 ; i < inputDouble.length;i++){
            inputDouble[i] = Double.parseDouble(inputChar[i]);
        }
        System.out.printf("The mean is %4.2f%n",mean(inputDouble));
        System.out.printf("The standard deviation is %5.5f",deviation(inputDouble));
    }

    public static double deviation(double[] x) {
        double sumOfSquares = 0;
        for (double v : x) {
            sumOfSquares += Math.pow((v - mean(x)), 2);
        }
        return Math.sqrt(sumOfSquares/(x.length-1));
    }

    public static double mean(double[] x) {
        double sumNumber = 0;
        for (double v : x) {
            sumNumber += v;
        }
        return sumNumber / x.length;
    }
}
