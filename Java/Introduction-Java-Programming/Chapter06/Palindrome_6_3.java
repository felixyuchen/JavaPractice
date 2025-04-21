import java.util.Scanner;

public class Palindrome_6_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num = scanner.nextInt();
        int result = reverse(num);
        System.out.println("The reversed number is: " + result);
        scanner.close();
        boolean ispalin = isPalindrome(num);
        if (ispalin) {
            System.out.println("This number is a palindrome!");
        } else {
            System.out.println("This number is not a palindrome!");
        }

    }

    public static int reverse(int number) {
//        String string1 = "";
//        String string2 = "";
//        int rev;
//        while(number!=0){
//            string1 = String.valueOf(number%10);
//            string2 +=string1;
//            number = number/10;
//        }
//           return rev = Integer.parseInt(string2);
        int reversedNumber = 0;
        while (number != 0) {
            int lastNumber = number % 10;
            reversedNumber = reversedNumber * 10 + lastNumber;
            number = number / 10;
        }
        return reversedNumber;
    }

    public static boolean isPalindrome(int number) {
        int revs = reverse(number);
        boolean palindrome;
//        if (number == revs) {
//            palindrome = true;
//        }
        palindrome = number == revs;
        return palindrome;
    }
}
