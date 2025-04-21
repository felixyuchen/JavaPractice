import java.util.Scanner;

public class ReversedNumber_6_4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number:");
        int num = scanner.nextInt();
        reverse(num);
        scanner.close();
    }

    public static void reverse(int number) {
//       String string1 = "";
//       String string2 = "";
//       while(number!=0){
//           string1 = String.valueOf(number%10);
//           string2 += string1;
//           number = number/10;
//       }
//       int revs = Integer.parseInt(string2);
        int reversedNumber = 0;
        while (number != 0) {
            int lastNumber = number % 10;
            reversedNumber = reversedNumber * 10 + lastNumber;
            number = number / 10;
        }
        System.out.println("The reversed number is:" + reversedNumber);
    }
}
