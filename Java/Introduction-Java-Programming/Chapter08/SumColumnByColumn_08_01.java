import java.util.Scanner;

public class SumColumnByColumn_08_01 {
    public static void main(String[] args) {
        double[][] doubleMatrix = new double[3][4];
        System.out.println("Enter a 3-by-4 matrix row by row: ");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                doubleMatrix[i][j] = scanner.nextDouble();
            }
        }
        scanner.close();
            for (int j = 0; j < 4; j++) {
                System.out.printf("Sum of the elements at column %d is %2.1f%n", j, sumColumn(doubleMatrix, j));
            }


    }

    public static double sumColumn(double[][] m, int columnIndex) {
        double sumColumn = 0D;
        for (double[] doubles : m) {
            sumColumn += doubles[columnIndex];
        }
        return sumColumn;
    }
}
