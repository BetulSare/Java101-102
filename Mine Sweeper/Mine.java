package minesweper;

import java.util.Scanner;


public class MineSweeper {
    private int rows;
    private int columns;
    private char[][] board;
    private boolean[][] mines;
    private int numMines;
    private boolean gameOver;

    public MineSweeper(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.board = new char[rows][columns];
        this.mines = new boolean[rows][columns];
        this.numMines = rows * columns / 4;
        this.gameOver = false;
    }

    public void play() {
        initializeBoard();
        placeMines();

        Scanner scanner = new Scanner(System.in);
        while (!gameOver) {
            printBoard();
            System.out.print("Enter row and column (e.g., 1 2): ");
            int row = scanner.nextInt();
            int col = scanner.nextInt();
            if (isValidMove(row, col)) {
                if (mines[row][col]) {
                    gameOver = true;
                    revealBoard();
                    System.out.println("Game Over! You stepped on a mine.");
                } else {
                    uncoverCell(row, col);
                    if (isGameWon()) {
                        gameOver = true;
                        revealBoard();
                        System.out.println("Congratulations! You won the game.");
                    }
                }
            } else {
                System.out.println("Invalid move. Please try again.");
            }
        }
    }

    private void initializeBoard() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                board[i][j] = '-';
            }
        }
    }

    private void placeMines() {
        int count = 0;
        while (count < numMines) {
            int row = (int) (Math.random() * rows);
            int col = (int) (Math.random() * columns);
            if (!mines[row][col]) {
                mines[row][col] = true;
                count++;
            }
        }
    }

    private void printBoard() {
        System.out.println();
        System.out.println("Board:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private boolean isValidMove(int row, int col) {
        return row >= 0 && row < rows && col >= 0 && col < columns && board[row][col] == '-';
    }

    private void uncoverCell(int row, int col) {
        int count = countAdjacentMines(row, col);
        if (count > 0) {
            board[row][col] = (char) (count + '0');
        } else {
            board[row][col] = '0';
            uncoverAdjacentCells(row, col);
        }
    }

    private int countAdjacentMines(int row, int col) {
        int count = 0;
        for (int i = row - 1; i <= row + 1; i++) {
            for (int j = col - 1; j <= col + 1; j++) {
                if (i >= 0 && i < rows && j >= 0 && j < columns && mines[i][j]) {
                    count++;
                }
            }
        }
        return count;
    }

    private void uncoverAdjacentCells(int row, int col) {
        for (int i = row - 1; i <= row + 1; i++) {
            for (int j = col - 1; j <= col + 1; j++) {
                if (i >= 0 && i < rows && j >= 0 && j < columns && board[i][j] == '-') {
                    uncoverCell(i, j);
                }
            }
        }
    }

    private void revealBoard() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (mines[i][j]) {
                    board[i][j] = '*';
                }
            }
        }
        printBoard();
    }

    private boolean isGameWon() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (!mines[i][j] && board[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }


}