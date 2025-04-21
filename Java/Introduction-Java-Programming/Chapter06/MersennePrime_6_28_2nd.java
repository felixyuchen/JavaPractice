public class MersennePrime_6_28_2nd {
    public static void main(String[] args) {
        System.out.printf("p     2^p-1%n");
        System.out.printf("-------------%n");
        for (int p = 2; p <= 31; p++) {
            int mersennePrime = 1;
            for (int i = 1; i <= p; i++) {
                mersennePrime *= 2;
            }
            mersennePrime -= 1;
            if (isPrime(mersennePrime)) {
                System.out.printf("%-2d    %d%n", p, mersennePrime);
            }
        }
    }

    public static boolean isPrime(int number) {
        boolean isPrime = true;
        for (int p = 2; p <= number / 2; p++) {
            if (number % p == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}
