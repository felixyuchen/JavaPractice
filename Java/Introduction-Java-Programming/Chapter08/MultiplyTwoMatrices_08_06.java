import java.util.Scanner;

public class MultiplyTwoMatrices_08_06 {
    public static void main(String[] args) {
        double[][] matrix1 = new double[3][3];
        double[][] matrix2 = new double[3][3];
        double[][] matrix3;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter matrix1: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix1[i][j] = scanner.nextDouble();
            }
        }
        System.out.print("Enter matrix2: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix2[i][j] = scanner.nextDouble();
            }
        }
        scanner.close();
        matrix3 = multiplyMatrix(matrix1, matrix2);
        for (double[] doubles : matrix3) {
            for (int j = 0; j < matrix3[0].length; j++) {
                System.out.printf("%2.1f ", doubles[j]);
            }
            System.out.println();
        }
    }

    public static double[][] multiplyMatrix(double[][] a, double[][] b) {
        double[][] multiplyMatrix = new double[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                for (int t = 0; t < a.length; t++) {
                    multiplyMatrix[i][j] += a[i][t] * b[t][j];
                }
            }
        }
        return multiplyMatrix;
    }
}
