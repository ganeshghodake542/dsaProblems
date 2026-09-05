package Backtracking;

public class suduko {

    public static boolean isSafe(char[][] board, int row, int col, char digit) {

        // Column
        for(int i = 0; i < 9; i++) {
            if(board[i][col] == digit) {
                return false;
            }
        }

        // Row
        for(int i = 0; i < 9; i++) {
            if(board[row][i] == digit) {
                return false;
            }
        }

        // 3 x 3 box
        int Sr = (row / 3) * 3;
        int Sc = (col / 3) * 3;

        for(int i = Sr; i < Sr + 3; i++) {
            for(int j = Sc; j < Sc + 3; j++) {
                if(board[i][j] == digit) {
                    return false;
                }
            }
        }

        return true;
    }


    public static boolean sudokuProb(char[][] board, int row, int col) {

        // Base condition
        if(row == 9) {
            return true;
        }

        int nextRow = row;
        int nextCol = col + 1;

        if(nextCol == 9) {
            nextRow = row + 1;
            nextCol = 0;
        }

        // IMPORTANT: cell already contains a number
        if(board[row][col] != '.') {
            return sudokuProb(board, nextRow, nextCol);
        }

        // Try 1 to 9
        for(char digit = '1'; digit <= '9'; digit++) {

            if(isSafe(board, row, col, digit)) {

                board[row][col] = digit;

                if(sudokuProb(board, nextRow, nextCol)) {
                    return true;
                }

                // Backtracking
                board[row][col] = '.';
            }
        }

        return false;
    }


    public boolean isValidSudoku(char[][] board) {
        return sudokuProb(board, 0, 0);
    }
}