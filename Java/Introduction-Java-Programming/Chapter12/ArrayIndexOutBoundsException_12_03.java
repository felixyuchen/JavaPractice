import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class ArrayIndexOutBoundsException_12_03 {
    public static void main(String[] args) {
        ArrayList<Integer> randomArray = new ArrayList<>();
        Random randomInt = new Random();
        for (int i = 0; i < 100; i++) {
            randomArray.add(randomInt.nextInt());
        }
        int j = 0;
        for (Integer integer : randomArray) {
            System.out.printf("%12d", integer);
            if (j < randomArray.size() - 1) System.out.print(", ");
            j++;
            if (j % 10 == 0) System.out.println();
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter an index(0-99): ");
        int indexArrayList;
        boolean invalidIndex = true;
        do {
            try {
                indexArrayList = scanner.nextInt();
                System.out.println("The value of the array is " + randomArray.get(indexArrayList));
                invalidIndex = false;
            } catch (IndexOutOfBoundsException ex0) {
                System.out.print("Out of Bounds. Please re-enter(0-99): ");
                scanner.nextLine();
            } catch (InputMismatchException ex1) {
                System.out.print("Input is wrong. Please re-enter(0-99): ");
                scanner.nextLine();
            }
        } while (invalidIndex);
    }
}
