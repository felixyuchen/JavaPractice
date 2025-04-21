public class Emirp_6_27 {
    public static void main(String[] args) {
        int count = 1;
        int number = 13;
        int countOfNumber = 1;
        while (count <= 100) {
            boolean isPalindrome = number == reversedNumber(number);
            if (isPrime(number) && !isPalindrome && isPrime(reversedNumber(number))) {
                System.out.printf("%d ", number);
                if (countOfNumber % 10 == 0) {
                    System.out.println();
                }
                count += 1;
                countOfNumber += 1;
            }
            number += 2;
        }
    }

    public static boolean isPrime(int number) {
        boolean primeFlag = true;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                primeFlag = false;
                break;
            }
        }
        return primeFlag;
    }

    public static int reversedNumber(int number) {
        int reversingNumber = number;
        int reversedNumber = 0;
        while (reversingNumber != 0) {
            int lastNumber = reversingNumber % 10;
            reversedNumber = reversedNumber * 10 + lastNumber;
            reversingNumber = reversingNumber / 10;
        }
        return reversedNumber;
    }
//    public static boolean isPalindrome(int number) {
//        boolean palindromeFlag;
////        int reversingNumber = number;
////        int reversedNumber = 0;
////        while (reversingNumber != 0) {
////            int lastNumber = reversingNumber % 10;
////            reversedNumber = reversedNumber * 10 + lastNumber;
////            reversingNumber = reversingNumber / 10;
////        }
//        palindromeFlag = number == reversedNumber(number);
//        return palindromeFlag;
//    }


}
