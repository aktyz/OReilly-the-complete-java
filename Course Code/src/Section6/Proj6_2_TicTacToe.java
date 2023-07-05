package Section6;

import java.util.Arrays;
import java.util.Scanner;

public class Proj6_2_TicTacToe {
    static final String X = "X";
    static final String O = "O";
    static final String TIE = "C";
    static final int ROWS = 3;
    static final int COLS = 3;
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        runGame();
    }

    public static void runGame() {
        boolean isXTurn = true;
        String winner = "";
        String[][] gameBoard = new String[ROWS][COLS];
        initializeGameBoard(gameBoard);
        while(!isBoardFull(gameBoard)) {
            printCurrentBoard(gameBoard);
            getUserInput(isXTurn, gameBoard);
            isXTurn = !isXTurn;
        }
    }

    public static void initializeGameBoard(String[][] gameBoard) {
        for (String[] strings : gameBoard) {
            /* java.utils.Arrays is part of Java Collections Framework
            * TODO: https://docs.oracle.com/javase/tutorial/collections/index.html
            **/
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

    public static void getUserInput(boolean isXTurn, String[][] gameBoard) {
        String player = isXTurn ? X : O;
        System.out.print("Player " + player + " please provide the row number (range 1 - 3) you would like to take:\t");
        int playerRow = s.nextInt();
        s.nextLine();
        System.out.print("Player " + player + " please provide the column number (range 1 - 3) you would like to take:\t");
        int playerColumn = s.nextInt();
        s.nextLine();
        boolean isUserInputValid = (playerRow >= 1 && playerRow < 4)
                && (playerColumn >= 1 && playerColumn < 4)
                && (!isCellAlreadyOccupied(playerRow - 1, playerColumn - 1, gameBoard));
        if(isUserInputValid) {
            gameBoard[playerRow - 1][playerColumn - 1] = player;
        }
        else {
            System.out.println("This cell doesn't exist or the cell is already occupied, try again");
            getUserInput(isXTurn, gameBoard);
        }
    }

    public static boolean isCellAlreadyOccupied(int row, int col, String[][] gameBoard) {
        return !gameBoard[row][col].equals(" ");
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
