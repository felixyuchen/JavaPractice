import java.util.Scanner;

public class DisplayPatterns_6_6 {
    public static void main(String[] args) {
        int number;
        System.out.print("Please enter a number:");
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        scanner.close();
        displayPattern(number);
    }


    public static void displayPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= (n - 1); j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1 ; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
