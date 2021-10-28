import java.util.Scanner;

public class ApproximateSquareRoot_6_22 {

    public static void main(String[] args) {
        System.out.print("Please enter a number: ");
        Scanner scanner = new Scanner(System.in);
        String stringN = scanner.nextLine();
        while (!isDigit(stringN)) {
            System.out.print("The number is invalid. Please enter a number: ");
            stringN = scanner.nextLine();
        }

        scanner.close();
        long iniN = Long.parseLong(stringN);
        double squareN = sqrt(iniN);
        System.out.printf("The square root of the number %d is %2.2f.", iniN, squareN);
    }

    public static double sqrt(long n) {
        double lastGuess = 1;
        double nextGuess = (lastGuess + n / lastGuess) / 2;
        while (!(Math.abs(lastGuess - nextGuess) <= 0.0001)) {
            lastGuess = nextGuess;
            nextGuess = (lastGuess + n / lastGuess) / 2;
        }
        return nextGuess;
    }

    public static boolean isDigit(String str) {
        boolean isDigit = true;
        int i = 0;
        while (isDigit && i < str.length()) {
            if (!Character.isDigit(str.charAt(i))) {
                isDigit = false;
            }
            i += 1;
        }
        return isDigit;
    }
}
