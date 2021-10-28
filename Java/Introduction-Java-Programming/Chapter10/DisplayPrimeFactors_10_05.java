import java.util.Scanner;

public class DisplayPrimeFactors_10_05 {
    public static void main(String[] args) {
        StackOfIntegers stackOfIntegers = new StackOfIntegers();
        System.out.print("Please enter an integer number: ");

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println();
        while (number <= 0) {
            System.out.print("Please re-enter the number: ");
            number = scanner.nextInt();
        }
        scanner.close();

        if (number == 1) {
            System.out.println("The prime factor is 1.");
        } else {
            int i = 2;
            while (number > 1) {
                while (number % i == 0) {
                    stackOfIntegers.push(i);
                    number /= i;
                }
                i++;
            }
        }
        while (!stackOfIntegers.empty()){
            System.out.printf("%d ",stackOfIntegers.pop());
        }
    }
}
