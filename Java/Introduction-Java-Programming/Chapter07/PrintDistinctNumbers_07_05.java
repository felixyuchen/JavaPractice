import java.util.Scanner;

public class PrintDistinctNumbers_07_05 {

    public static void main(String[] args) {
        System.out.print("Enter ten numbers: ");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        String[] stringArray = inputString.split(" ");
        int[] intArray = new int[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            intArray[i] = Integer.parseInt(stringArray[i]);
        }
        printDistinct(intArray);
    }

    public static void printDistinct(int... numbers) {
        int[] distinctNumbers = new int[10];
        distinctNumbers[0] = numbers[0];
        int distinctIndex = 1;
        int j;
        boolean distinctFlag = true;
        for (int i = 1; i < numbers.length; i++) {
            for (j = 0; j < distinctIndex; j++) {
                if (numbers[i] == distinctNumbers[j]) {
                    distinctFlag = false;
                    break;
                }
            }
            if (distinctFlag) {
                distinctNumbers[distinctIndex] = numbers[i];
                distinctIndex = j + 1;
            }
            distinctFlag = true;
        }
        System.out.printf("The number of distinct number is %d%nThe distinct numbers are:", distinctIndex);

        for (j = 0; j < distinctIndex; j++) {
            System.out.printf(" %d", distinctNumbers[j]);
        }

    }
}

