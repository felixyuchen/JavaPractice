import java.util.Scanner;

public class SumDigits_6_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number:");
        long num = sc.nextInt();
        int result = sumDigits(num);
        System.out.println("The sum of digits is: "+ result);
        sc.close();
    }
    public static int sumDigits(long n){
        int sum = 0;
        while (n!=0){
            sum = sum + (int)n%10;
            n = n/10;
        }
        return sum;
    }

}
