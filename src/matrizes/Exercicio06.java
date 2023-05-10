package matrizes;

import java.util.Scanner;

public class Exercicio06 {
    private static final int BOARD_SIZE = 3;
    private static final char EMPTY_CELL = '-';
    private static final char PLAYER_X = 'X';
    private static final char PLAYER_O = 'O';

    private char[][] board;
    private char currentPlayer;

    public Exercicio06() {
        board = new char[BOARD_SIZE][BOARD_SIZE];
        currentPlayer = PLAYER_X;
        initializeBoard();
    }

    private void initializeBoard() {
        for (int row = 0; row < BOARD_SIZE; row++) {
            for (int col = 0; col < BOARD_SIZE; col++) {
                board[row][col] = EMPTY_CELL;
            }
        }
    }

    private void printBoard() {
        System.out.println("-------------");
        for (int row = 0; row < BOARD_SIZE; row++) {
            for (int col = 0; col < BOARD_SIZE; col++) {
                System.out.print("| " + board[row][col] + " ");
            }
            System.out.println("|");
            System.out.println("-------------");
        }
    }

    private boolean isMoveValid(int row, int col) {
        if (row < 0 || row >= BOARD_SIZE || col < 0 || col >= BOARD_SIZE) {
            return false;
        }
        return board[row][col] == EMPTY_CELL;
    }

    private void makeMove(int row, int col) {
        board[row][col] = currentPlayer;
    }

    private boolean hasWon(char player) {
        for (int i = 0; i < BOARD_SIZE; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) {
                return true; // Check rows
            }
            if (board[0][i] == player && board[1][i] == player && board[2][i] == player) {
                return true; // Check columns
            }
        }
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true; // Check diagonal
        }
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true; // Check reverse diagonal
        }
        return false;
    }

    private boolean isBoardFull() {
        for (int row = 0; row < BOARD_SIZE; row++) {
            for (int col = 0; col < BOARD_SIZE; col++) {
                if (board[row][col] == EMPTY_CELL) {
                    return false;
                }
            }
        }
        return true;
    }

    private void switchPlayer() {
        currentPlayer = (currentPlayer == PLAYER_X) ? PLAYER_O : PLAYER_X;
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Tic-Tac-Toe");
        System.out.println("Enter row and column numbers (0-" + (BOARD_SIZE - 1) + ") to make a move.");

        while (true) {
            System.out.println("\nCurrent board:");
            printBoard();

            int row, col;
            do {
                System.out.print("\nPlayer " + currentPlayer + ", enter your move: ");
                row = scanner.nextInt();
                col = scanner.nextInt();
            } while (!isMoveValid(row, col));

            makeMove(row, col);
            if (hasWon(currentPlayer)) {
                System.out.println("\nPlayer " + currentPlayer + " wins!");
                printBoard();
                break;
            }

            if (isBoardFull()) {
                System.out.println("\nThe game is a tie!");
                printBoard();
                break;
            }

            switchPlayer();
        }
        scanner.close();
    }

    public static void main(String[] args) {
        Exercicio06 game = new Exercicio06();
        game.play();
    }
}
