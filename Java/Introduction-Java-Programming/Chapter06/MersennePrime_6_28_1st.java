public class MersennePrime_6_28_1st {
    public static void main(String[] args) {
        int mersennePrime;
        double mersenne;
        System.out.printf("p      2^p-1%n");
        System.out.printf("-------------%n");
        for (int p = 2; p <= 31; p++) {
            mersenne = Math.pow(2,p);
            mersennePrime = (int) (mersenne - 1);
            if (isPrime(mersennePrime)) {
                System.out.printf("%-2d     %d%n", p, mersennePrime);
            }
        }
    }

    public static boolean isPrime(int number) {
        boolean isPrime = true;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}
