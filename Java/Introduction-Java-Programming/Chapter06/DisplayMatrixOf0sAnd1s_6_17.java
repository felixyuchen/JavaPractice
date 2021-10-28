import java.util.Scanner;

public class DisplayMatrixOf0sAnd1s_6_17 {

    public static void main(String[] args) {
        System.out.print("Enter n:");
        Scanner scanner = new Scanner(System.in);
        int matrixSize = scanner.nextInt();
        printMatrix(matrixSize);
    }

    public static void printMatrix(int n) {
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n; i++) {
                System.out.printf("%d ", (int) (Math.random() * 2));
            }
            System.out.println();
        }
    }
}
