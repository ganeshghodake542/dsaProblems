package Backtracking;

public class nQueen {

    public static boolean isSafe(char board[][], int row, int col) {

        // Check vertical column
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // Check upper-left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {

            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // Check upper-right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {

            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    public static void nInnerQueen(char board[][], int row) {

        // Base case
        if (row == board.length) {
            printBoard(board);
            return;
        }

        // Main case
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {

                board[row][j] = 'Q';

                nInnerQueen(board, row + 1);

                // Backtracking
                board[row][j] = '.';
            }
        }

    }

    public static void printBoard(char board[][]) {

        for (int i = 0; i < board.length; i++) {

            for (int j = 0; j < board.length; j++) {

                System.out.print(board[i][j] + " ");
            }

            System.out.println();
        }

        System.out.println();
    }

    public static void main(String[] args) {

        int n = 4;

        char board[][] = new char[n][n];

        // Fill board with '.'
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                board[i][j] = '.';
            }
        }

        nInnerQueen(board, 0);
    }
}