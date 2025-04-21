import java.util.Scanner;

public class TicTacToeGame_08_09 {
    public static void main(String[] args) {
        char[][] grid = new char[3][3];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                grid[i][j] = ' ';
            }
        }
        printGrid(grid);
        boolean wonFlag = false;
        Scanner scanner = new Scanner(System.in);
        char player = ' ';
        boolean isDraw = false;
        while (!wonFlag && !isDraw) {
            System.out.print("Enter a row (0, 1, or 2) for player X: ");
            int row = scanner.nextInt();
            System.out.print("Enter a column (0, 1, or 2) for player X: ");
            int column = scanner.nextInt();
            while (grid[row][column] != ' ') {
                System.out.print("The position is occupied. Please re-enter a row (0, 1, or 2) for player X: ");
                row = scanner.nextInt();
                System.out.print("Enter a column (0, 1, or 2) for player X: ");
                column = scanner.nextInt();
            }
            grid[row][column] = 'X';
            printGrid(grid);
            wonFlag = hasWon(grid[row][column], grid);
            isDraw = isDraw(grid);
            player = grid[row][column];
            if (wonFlag || isDraw) break;

            System.out.print("Enter a row (0, 1, or 2) for player O: ");
            row = scanner.nextInt();
            System.out.print("Enter a column (0, 1, or 2) for player O: ");
            column = scanner.nextInt();
            while (grid[row][column] != ' ') {
                System.out.print("The position is occupied. Please re-enter a row (0, 1, or 2) for player O: ");
                row = scanner.nextInt();
                System.out.print("Enter a column (0, 1, or 2) for player O: ");
                column = scanner.nextInt();
            }
            grid[row][column] = 'O';
            printGrid(grid);
            wonFlag = hasWon(grid[row][column], grid);
            isDraw = isDraw(grid);
            player = grid[row][column];
            if (wonFlag || isDraw) break;
        }
        if (wonFlag && !isDraw(grid)) {
            System.out.printf("%c player won!", player);
        } else if (isDraw(grid)) {
            System.out.print("It is draw. No one won.");
        }

    }

    public static void printGrid(char[][] grid) {
        for (char[] chars : grid) {
            System.out.println("--------------");
            for (int j = 0; j < grid[0].length; j++) {
                System.out.printf("| %c ", chars[j]);
            }
            System.out.printf("|%n");
        }
        System.out.println("--------------");
    }

    public static boolean hasWon(char player, char[][] grid) {
        return grid[0][0] == player && grid[0][1] == player && grid[0][2] == player ||
                grid[1][0] == player && grid[1][1] == player && grid[1][2] == player ||
                grid[2][0] == player && grid[2][1] == player && grid[2][2] == player ||
                grid[0][0] == player && grid[1][0] == player && grid[2][0] == player ||
                grid[0][1] == player && grid[1][1] == player && grid[2][1] == player ||
                grid[0][2] == player && grid[1][2] == player && grid[2][2] == player ||
                grid[0][0] == player && grid[1][1] == player && grid[2][2] == player ||
                grid[0][2] == player && grid[1][1] == player && grid[2][0] == player;
    }

    public static boolean isDraw(char[][] grid) {
        boolean isDraw = true;
        for (int i = 0; i < grid.length; i++)
            for (int j = 0; j < grid.length; j++)
                if (grid[i][j] == ' ') {
                    isDraw = false;
                    break;
                }
        return isDraw;
    }
}
