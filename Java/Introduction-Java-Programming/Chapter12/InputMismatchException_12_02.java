import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchException_12_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter 2 integers: ");
        int inputInteger1;
        int inputInteger2;
        boolean continueInput = true;
        do {
            try {
                inputInteger1 = scanner.nextInt();
                inputInteger2 = scanner.nextInt();
                int result = inputInteger1 + inputInteger2;
                System.out.println("The sum is " + result);
                continueInput = false;
            } catch (InputMismatchException ex) {
                System.out.print("The number is invalid. Please reenter: ");
                scanner.nextLine();
            }
        } while (continueInput);
    }
}
