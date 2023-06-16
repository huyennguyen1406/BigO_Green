package Lecture08_Midterm;

public class Sudoku {
    private final int GRID_SIZE = 9;

    public void solveSudoku(char[][] board) {
        solveBoard(board);
    }

    private boolean solveBoard(char[][] board) {
        for(int row = 0; row < GRID_SIZE; row++) {
            for(int column = 0; column < GRID_SIZE; column++) {

                if(board[row][column] == '.') {

                    for(int numberToTry = 1; numberToTry <= GRID_SIZE; numberToTry++) {
                        if(isValidPlacement(board, numberToTry, row, column)) {

                            board[row][column] = (char)(numberToTry + '0');
                            if(solveBoard(board)) return true;
                            board[row][column] = '.';

                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isValidPlacement(char[][] board, int number, int row, int col) {
        for(int i = 0; i < GRID_SIZE; i++) {
            if(board[row][i] == (char)number+'0') return false;
            if(board[i][col] == (char)number+'0') return false;
            if(board[3 * (row / 3) + i/3][3 * (col / 3) + i%3] == (char)number+'0') return false;
        }
        return true;
    }
}
