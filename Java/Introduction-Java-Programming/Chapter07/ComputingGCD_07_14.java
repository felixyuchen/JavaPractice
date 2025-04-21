import java.util.Scanner;

public class ComputingGCD_07_14 {
    public static void main(String[] args) {
        System.out.print("Please enter the numbers: ");
        Scanner scanner = new Scanner(System.in);
//        String inputString = scanner.nextLine();
//        scanner.close();
//        String[] inputChar = inputString.split(" ");
//        int[] inputNumbers = new int[inputChar.length];

//        for (int i =0; i< inputChar.length;i++){
//            inputNumbers[i] = Integer.parseInt(inputChar[i]);
//        }
        int[] inputNumbers = new int[3];
        for (int i = 0; i < inputNumbers.length; i++) {
            inputNumbers[i] = scanner.nextInt();
        }
        scanner.close();
        System.out.printf("The gcd is: %d", gcd(inputNumbers));
    }

    public static int getGcd(int m, int n) {
        if (n == 0)
            return m;
        return getGcd(n, m % n);
    }

    public static int gcd(int... numbers) {
        int gcd = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            gcd = getGcd(gcd, numbers[i]);
        }
        return gcd;
    }
}
