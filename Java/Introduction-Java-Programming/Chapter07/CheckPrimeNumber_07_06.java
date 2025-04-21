public class CheckPrimeNumber_07_06 {

    public static void main(String[] args) {
        int[] primeArray = new int[50];
        int count = 0;
        int i = 2;
        while (count < 50) {
            if ((i % 2 != 0 || i == 2) && isPrime(i)) {
                primeArray[count] = i;
                count++;
            }
            i++;
        }
        System.out.println("The prime numbers are: ");
        for (int j = 0; j < 50; j++) {
            System.out.printf("%4d", primeArray[j]);
            if ((j+1) % 10 == 0) {
                System.out.println();
            }
        }
    }

    public static boolean isPrime(int number) {
        boolean isPrime = true;
        for (int i = 2; i <= (int) Math.sqrt(number); i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

}


