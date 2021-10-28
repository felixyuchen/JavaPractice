public class PrimeNumberMethod_6_10 {
    public static void main(String[] args) {
        int numberOfPrime = 0;
        for (int i = 2; i <= 10000; i++) {
            if (i % 2 != 0 || i == 2) {
                if (isPrime(i)) {
                    System.out.printf("%4d", i);
                    numberOfPrime += 1;
                    if (numberOfPrime % 10 != 0) {
                        System.out.printf("%s", ",");
                    } else {
                        System.out.println();
                    }
                }

            }
        }
    }

    public static boolean isPrime(int number) {
        boolean flag = true;
        for (int i = 2; i <= (int) Math.sqrt(number); i++) {
            if (number % i == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
