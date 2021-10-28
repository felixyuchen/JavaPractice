public class PalindromePrime_6_26 {
    public static void main(String[] args) {
        int count = 1;
        int number = 2;
        int countOfNumber = 1;
        while (count <= 100) {
            if (isPalindromePrime(number)) {
                System.out.printf("%d ", number);
                if (countOfNumber % 10 == 0){
                    System.out.println();
                }
                count += 1;
                countOfNumber += 1;
            }number += 1;
        }
    }

    public static boolean isPalindromePrime(int number) {
        int reversedNumber = 0;
        boolean primeFlag = true;
        boolean isPalindromePrime;
        int reversingNumber = number;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                primeFlag = false;
                break;
            }
        }
        while (reversingNumber != 0) {
            int lastNumber = reversingNumber % 10;
            reversedNumber = reversedNumber * 10 + lastNumber;
            reversingNumber = reversingNumber / 10;
        }

        isPalindromePrime = number == reversedNumber && primeFlag;
        return isPalindromePrime;
    }
}
