package Section6;

import java.util.Arrays;

public class Proj6_2_TicTacToe {
    static final String X = "X";
    static final String O = "O";
    static final String TIE = "C";
    static final int ROWS = 3;
    static final int COLS = 3;
    public static void main(String[] args) {
        runGame();
    }

    public static void runGame() {
        String winner = "";
        String[][] gameBoard = new String[ROWS][COLS];
        initializeGameBoard(gameBoard);
        printCurrentBoard(gameBoard);
    }

    public static void initializeGameBoard(String[][] gameBoard) {
        for (String[] strings : gameBoard) {
            Arrays.fill(strings, " ");
        }
    }

    public static void printCurrentBoard(String[][] gameBoard) {
        for (int i = 0; i < gameBoard.length; i++) {
            for (int j = 0; j < gameBoard[i].length; j++) {
                System.out.print(gameBoard[i][j]);
                if(j < 2) {
                    System.out.print(" | ");
                }
            }
            System.out.println();
            if(i < 2) {
                System.out.print("- - - - -");
                System.out.println();
            }
        }
    }

    public static void getUserInput(boolean isXTurn, String[][] gameBoard) {}

    public static boolean isCellAlreadyOccupied(int row, int col, String[][] gameBoard) {
        return false;
    }

    public static String getWinner(String[][] gameBoard) {
        return "";
    }

    public static boolean isBoardFull(String[][] gameBoard) {
        int sumOfOccupiedFields = 0;
        for (String[] strings : gameBoard) {
            for (String string : strings) {
                if (!(string.equals(" "))) sumOfOccupiedFields++;
            }
        }
        return sumOfOccupiedFields == 9;
    }
}
