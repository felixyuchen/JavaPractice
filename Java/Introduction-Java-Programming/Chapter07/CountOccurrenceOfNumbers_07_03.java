import java.util.Scanner;

public class CountOccurrenceOfNumbers_07_03 {

    public static void main(String[] args) {
        System.out.print("Enter the integers between 1 and 100: ");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        String[] stringArray = inputString.split(" ");
        int[] inputInt = new int[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            inputInt[i] = Integer.parseInt(stringArray[i]);
        }
        // sort the int array and print it out
        selectionSort(inputInt);
        System.out.print("The sorted number is: ");
        for (int i : inputInt) {
            System.out.printf("%d ", i);
        }
        System.out.println();

/*count the occurrence of each number in array. Since the numbers have been sorted by ascend, we can add the count
as the next start index.
*/
        int x = 0;
        while (x < inputInt.length) {
            int count = 1;
            int y = x + 1;
            while (y < inputInt.length && inputInt[y] == inputInt[x]) {
                count++;
                y++;
            }
            String time = count == 1 ? "time" : "times";
            System.out.printf("%d occurs %d %s%n", inputInt[x], count, time);
            x += count;
        }
    }

    public static void selectionSort(int... numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            int currentMin = numbers[i];
            int currentMinIndex = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (currentMin > numbers[j]) {
                    currentMin = numbers[j];
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex != i) {
                numbers[currentMinIndex] = numbers[i];
                numbers[i] = currentMin;
            }
        }
    }
}
