import java.util.Scanner;

public class IndexOfSmallestElement_07_10 {
    public static void main(String[] args) {
        System.out.print("Please enter 10 double numbers: ");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        String[] inputChar = inputString.split(" ");
        double[] inputDouble = new double[inputChar.length];
        for (int i=0; i<inputDouble.length;i++){
            inputDouble[i] = Double.parseDouble(inputChar[i]);
        }
        int minimumIndex = indexOfSmallestElement(inputDouble);
        System.out.printf("The mini index is: %d",minimumIndex);
    }

    public static int indexOfSmallestElement(double[] array) {
        int indexOfSmallest = 0;
        double smallestElement = array[0];
        for (int i = 1; i < array.length; i++) {
            if (smallestElement > array[i]) {
                smallestElement = array[i];
                indexOfSmallest = i;
            }
        }
        return indexOfSmallest;
    }
}
