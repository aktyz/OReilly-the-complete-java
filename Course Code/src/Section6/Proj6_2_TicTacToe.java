package Section6;

public class Proj6_2_TicTacToe {
    public static void main(String[] args) {
        runGame();
    } // end of main()

    public static void runGame() {
        String winner = "";
        String X = "X";
        String O = "O";
        String TIE = "C";
        int ROWS = 3;
        int COLS = 3;
        String[][] gameBoard = new String[ROWS][COLS];
        initializeGameBoard(gameBoard);
        printCurrentBoard(gameBoard);
    }

    public static void initializeGameBoard(String[][] gameBoard) {
        for(int i = 0; i < gameBoard.length; i++) {
            for(int j = 0; j < gameBoard[i].length; j++) {
                gameBoard[i][j] = " ";
            }
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
        return false;
    }
}
