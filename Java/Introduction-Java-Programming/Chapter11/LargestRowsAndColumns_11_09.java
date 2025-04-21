import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class LargestRowsAndColumns_11_09 {
    public static void main(String[] args) {
        int row = 0;
        int column = 0;
        int rowMax = 0;
        int columnMax = 0;
        ArrayList<Integer> arrayListRow = new ArrayList<>();
        ArrayList<Integer> arrayListColumn = new ArrayList<>();
        System.out.print("Please enter the matrix size n: ");
        int sizeMatrix;
        Scanner scanner = new Scanner(System.in);
        sizeMatrix = scanner.nextInt();
        scanner.close();
        int[][] array;
        array = createMatrix(sizeMatrix);
        System.out.println("The random array is");
        for (int i = 0; i < sizeMatrix; i++) {
            for (int j = 0; j < sizeMatrix; j++) {
                System.out.printf("%d ", array[i][j]);
                row += array[i][j];
                column += array[j][i];
            }
            System.out.println();
            if (row > rowMax) rowMax = row;
            if (column > columnMax) columnMax = column;
            row = 0;
            column = 0;
        }

        for (int i = 0; i < sizeMatrix; i++) {
            for (int j = 0; j < sizeMatrix; j++) {
                row += array[i][j];
                column += array[j][i];
            }
            if (row == rowMax) arrayListRow.add(i);
            if (column == columnMax) arrayListColumn.add(i);
            row = 0;
            column = 0;
        }
        System.out.print("The largest row index: ");
        for (int i =0;i<arrayListRow.size();i++) {
            System.out.print(arrayListRow.get(i));
            if(i != arrayListRow.size()-1)
                System.out.print(", ");
        }
        System.out.println();
        System.out.print("The largest column index: ");
        for (int i =0;i<arrayListColumn.size();i++) {
            System.out.print(arrayListColumn.get(i));
            if(i != arrayListColumn.size()-1)
                System.out.print(", ");
        }
    }

    public static int[][] createMatrix(int size) {
        int[][] array = new int[size][size];
        Random random = new Random();
        for (int i = 0; i < size; i++)
            for (int j = 0; j < size; j++) {
                array[i][j] = random.nextInt(2);
            }
        return array;
    }
}
