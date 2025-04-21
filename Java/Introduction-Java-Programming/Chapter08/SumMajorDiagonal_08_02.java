import java.util.Scanner;

public class SumMajorDiagonal_08_02 {
    public static void main(String[] args) {
        System.out.println("Enter a 4-by-4 matrix row by row:");
        Scanner scanner = new Scanner(System.in);
        double[][] sumMajorDiagonal = new double[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                sumMajorDiagonal[i][j] = scanner.nextDouble();
            }
        }
        scanner.close();
        System.out.printf("Sum of the elements in the major diagonal is %2.1f", sumMajorDiagonal(sumMajorDiagonal));
    }

    public static double sumMajorDiagonal(double[][] m) {
        double sumMajorDiagonal = 0;
        for (int i = 0; i < m.length; i++) {
            sumMajorDiagonal += m[i][i];
        }
        return sumMajorDiagonal;
    }
}
