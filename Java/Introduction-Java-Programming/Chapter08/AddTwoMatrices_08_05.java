import java.util.Scanner;

public class AddTwoMatrices_08_05 {
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
        matrix3 = addMatrix(matrix1, matrix2);
        System.out.println("The matrices are added as follows");
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                System.out.printf("%2.1f  ", matrix1[i][j]);
            }
            if (i == 1) {
                System.out.print(" +");
            }
            System.out.print("   ");
            for (int j = 0; j < matrix2[i].length; j++) {
                if (i != 1) {
                    System.out.printf("  %2.1f", matrix2[i][j]);
                } else {
                    System.out.printf("%2.1f  ", matrix2[i][j]);
                }
            }
            if (i == 1) {
                System.out.print(" =    ");
            } else {
                System.out.print("      ");
            }
            for (int j = 0; j < matrix3[i].length; j++) {
                if (i != 1) {
                    System.out.printf("  %2.1f", matrix3[i][j]);
                } else {
                    System.out.printf("%2.1f  ", matrix3[i][j]);
                }
            }
            System.out.println();
        }
    }

    public static double[][] addMatrix(double[][] a, double[][] b) {
        double[][] addMatrix = new double[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                addMatrix[i][j] = a[i][j] + b[i][j];
            }
        }
        return addMatrix;
    }
}
