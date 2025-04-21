import java.util.ArrayList;
import java.util.Scanner;

public class EliminateDuplicates_07_15 {
    public static void main(String[] args) {
        System.out.print("Please enter the numbers: ");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        scanner.close();
        String[] inputChar = inputString.split(" ");
        int[] inputNumber = new int[inputChar.length];
        for (int i = 0; i < inputChar.length; i++) {
            inputNumber[i] = Integer.parseInt(inputChar[i]);
        }
        int[] distinctNumbers = eliminateDuplicates(inputNumber);
        System.out.print("The distinct numbers are: ");
        for (int distinctNumber : distinctNumbers) {
            System.out.printf("%d ", distinctNumber);
        }

    }

    public static int[] eliminateDuplicates(int[] list) {
        ArrayList list1 = new ArrayList();
        int[] intArr = new int[list.length];
        int j = 0;
        for (int k : list) {
            if (!list1.contains(k)) {
                list1.add(k);
                intArr[j] = k;
                j++;
            }
        }
        return intArr;
    }
}
