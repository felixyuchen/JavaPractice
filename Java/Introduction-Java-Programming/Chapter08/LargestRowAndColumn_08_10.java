import java.util.Scanner;

public class LargestRowAndColumn_08_10 {
    public static void main(String[] args) {
        System.out.print("Please enter the row number: ");
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        System.out.print("Please enter the column number: ");
        int column = scanner.nextInt();
        int[][] matrix;
        matrix = createMatrix(row, column);
        //printMatrix(row, column, matrix);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

        int[][] sumOfOne = new int[row + column][2];
        int maxRow = sumOfOne[0][0];
        int maxColumn = sumOfOne[0][1];
        int maxRowIndex = 0;
        int maxColumnIndex = 0;
        // store the number of 1 to array, sumOfOne[i][0] is for row
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (matrix[i][j] == 1) {
                    sumOfOne[i][0]++;
                }
                if(maxRow < sumOfOne[i][0]){
                    maxRow = sumOfOne[i][0];
                    maxRowIndex = i;
                }
            }
        }
        System.out.printf("The largest row index: %d%n",maxRowIndex);

        // store the number of 1 to array, sumOfOne[i][1] is for column
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                if (matrix[j][i] == 1) {
                    sumOfOne[i][1]++;
                }
                if(maxColumn < sumOfOne[i][1]){
                    maxColumn = sumOfOne[i][1];
                    maxColumnIndex = i;
                }
            }
        }
        System.out.printf("The largest column index: %d",maxColumnIndex);
    }

    public static int[][] createMatrix(int row, int column) {
        int[][] matrix = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = (int) (Math.random() * 2);
            }
        }
        return matrix;
    }

//    public static void printMatrix(int row, int column, int[][]... matrix) {
//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < column; j++) {
//                System.out.print(matrix[i][j]);
//            }
//            System.out.println();
//        }
//    }
}
