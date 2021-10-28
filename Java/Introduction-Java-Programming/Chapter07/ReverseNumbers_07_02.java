import java.util.Scanner;

public class ReverseNumbers_07_02 {
    public static void main(String[] args) {
        System.out.print("Please enter the numbers: ");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        String[] stringArray = inputString.split(" ");
        int[] inputNumber = new int[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            inputNumber[i] = Integer.parseInt(stringArray[i]);
        }
        reverseNumbers(inputNumber);
    }

    public static void reverseNumbers(int... numbers) {
        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - i - 1];
            numbers[numbers.length - i - 1] = temp;
        }
        System.out.print("The reversed numbers are ");
        for (int number : numbers) {
            System.out.printf("%d ", number);
        }
    }
}
