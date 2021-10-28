import java.util.Scanner;

public class RandomNumberChooser_07_13 {
    public static void main(String[] args) {
        System.out.print("Please enter the numbers 1 - 54: ");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        String[] inputChar = inputString.split(" ");
        scanner.close();
        int[] inputNumber = new int[inputChar.length];
        for (int i =0; i < inputNumber.length;i++){
            inputNumber[i] = Integer.parseInt(inputChar[i]);
        }
        int random = getRandom(inputNumber);
        System.out.printf("The random number is: %d",random);
    }

    public static int getRandom(int... numbers) {
        int randomNumber = 1 + (int) (Math.random() * 53);
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == randomNumber) {
                randomNumber = 1 + (int) (Math.random() * 53);
                i = 0;
            }
        }
        return randomNumber;
    }
}
