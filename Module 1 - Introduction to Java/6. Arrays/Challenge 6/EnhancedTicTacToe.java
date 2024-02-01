import java.util.Scanner;

public class EnhancedTicTacToe {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\nLet's play tic tac toe");

        // Task 1: Create an array with three rows of '_' characters.
        char[][] board = {
                { '_', '_', '_' },
                { '_', '_', '_' },
                { '_', '_', '_' }
        };

        // Task 2: Call the function printBoard();
        printBoard(board);

        // Task 3: Loop through turns.
        for (int i = 0; i < 9; i++) {
            if (i % 2 == 0) {
                System.out.println("Turn: X");
            } else {
                System.out.println("Turn: O");
            }

            // Task 4: Call askUser().
            int[] spot = askUser(board);

            // Task 5: Populate the board using askUser's return value.
            // 'X' for even turns, 'O' for odd turns.
            board[spot[0]][spot[1]] = (i % 2 == 0) ? 'X' : 'O';

            // Task 6: Call the function checkWin().
            int result = checkWin(board);
            if (result == 3) {
                System.out.println("X WINS!");
                break;
            } else if (result == -3) {
                System.out.println("O WINS!");
                break;
            } else if (result == 8) {
                System.out.println("IT'S A TIE!");
                break;
            }

            // Task 7: Print the updated board.
            printBoard(board);
        }

        scan.close();
    }

    // Task 2: Write a function that prints the board.
    public static void printBoard(char[][] board) {
        System.out.print("\n");
        for (int i = 0; i < board.length; i++) {
            System.out.print("\t");
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    // Task 4: Write a function that lets the user choose a spot.
    public static int[] askUser(char[][] board) {
        int row, column;

        // Ask the user to pick a row and column.
        do {
            System.out.print("Pick a row and column number: ");
            row = scan.nextInt();
            column = scan.nextInt();

            // Check if the spot is taken or out of bounds.
            if (row < 0 || row > 2 || column < 0 || column > 2 || board[row][column] != '_') {
                System.out.println("Invalid spot, try again.");
            } else {
                break; // Exit the loop if the chosen spot is valid.
            }
        } while (true);

        return new int[] { row, column };
    }

    // Task 6: Write a function that determines the winner.
    public static int checkWin(char[][] board) {
        // Check for wins in rows, columns, and diagonals.
        int rowResult = checkRows(board);
        int columnResult = checkColumns(board);
        int leftDiagonalResult = checkLeft(board);
        int rightDiagonalResult = checkRight(board);

        // Return the first non-zero result if any, else return -1.
        if (rowResult != 0) {
            return rowResult;
        } else if (columnResult != 0) {
            return columnResult;
        } else if (leftDiagonalResult != 0) {
            return leftDiagonalResult;
        } else if (rightDiagonalResult != 0) {
            return rightDiagonalResult;
        } else {
            return -1;
        }
    }

    // Helper function to check for wins in rows.
    public static int checkRows(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            if (board[i][0] == 'X' && board[i][1] == 'X' && board[i][2] == 'X') {
                return 3; // X wins
            } else if (board[i][0] == 'O' && board[i][1] == 'O' && board[i][2] == 'O') {
                return -3; // O wins
            }
        }
        return 0;
    }

    // Task 8: Helper function to check for wins in columns.
    public static int checkColumns(char[][] board) {
        // Your implementation for checking wins in columns.
        return 0;
    }

    // Task 9: Helper function to check for wins in the left diagonal.
    public static int checkLeft(char[][] board) {
        // Your implementation for checking wins in the left diagonal.
        return 0;
    }

    // Task 10: Helper function to check for wins in the right diagonal.
    public static int checkRight(char[][] board) {
        // Your implementation for checking wins in the right diagonal.
        return 0;
    }
}
