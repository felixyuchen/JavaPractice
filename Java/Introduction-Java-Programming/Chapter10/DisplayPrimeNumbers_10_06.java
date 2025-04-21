import java.util.Scanner;

public class DisplayPrimeNumbers_10_06 {
    public static void main(String[] args) {
        System.out.print("Please enter a number: ");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        while (!isDigit(inputString) || inputString.equals("0") || inputString.equals("1")) {
            System.out.print("The number is not valid. Please re-enter a number: ");
            inputString = scanner.nextLine();
        }
        scanner.close();
        int inputNumber = Integer.parseInt(inputString);
        StackOfIntegers stackOfIntegers = new StackOfIntegers();
        stackOfIntegers.push(2);
        for (int i = 3; i < inputNumber; i = i + 2) {
            if (isPrime(i)) {
                stackOfIntegers.push(i);
            }
        }
        System.out.println("The primes are: ");
        int[] elements = new int[stackOfIntegers.getSize()];
        for (int i = 0; i < elements.length; i++) {
            elements[i] = stackOfIntegers.pop();
        }
        int number = 0;
        for (int i = elements.length - 1; i >= 0; i--) {
            if (i > 0) {
                System.out.printf("%4d,", elements[i]);
                number++;
                if (number % 10 == 0) {
                    System.out.println();
                }
            } else {
                System.out.printf("%4d.", elements[i]);
            }
        }

    }

    public static boolean isDigit(String string) {
        for (int i = 0; i < string.length(); i++) {
            if (!Character.isDigit(string.charAt(i)))
                return false;
        }
        return true;
    }

    public static boolean isPrime(int number) {
        boolean isPrime = true;
        for (int i = 2; i * i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}
