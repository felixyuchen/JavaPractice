public class PentagonalNumber {

    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            int result = getPentagonalNumber(i);
            System.out.print(result + "  ");
            if (i % 10 == 0) {
                System.out.println();
            }
        }
    }

    public static int getPentagonalNumber(int n) {
        int result = (n * (3 * n - 1)) / 2;
        return result;
    }
}
