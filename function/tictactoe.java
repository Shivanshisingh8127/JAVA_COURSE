import java.util.Scanner;

public class tictactoe {

    public static void main(String[] args) {
        char[][] board = new char[3][3];

        // Fill board with '-'
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }

        Scanner sc = new Scanner(System.in);
        char currentPlayer = 'X';
        boolean gameOver = false;

        while (!gameOver) {
            printBoard(board);

            System.out.println("Player " + currentPlayer + ", enter row and column (0, 1, or 2): ");
            int row = sc.nextInt();
            int col = sc.nextInt();

            // Check for valid move
            if (row < 0 || col < 0 || row > 2 || col > 2 || board[row][col] != '-') {
                System.out.println("Invalid move. Try again.");
                continue;
            }

            // Place symbol
            board[row][col] = currentPlayer;

            // Check if player wins
            if (checkWin(board, currentPlayer)) {
                printBoard(board);
                System.out.println("Player " + currentPlayer + " wins!");
                gameOver = true;
            } 
            // Check draw
            else if (isBoardFull(board)) {
                printBoard(board);
                System.out.println("It's a draw!");
                gameOver = true;
            } 
            else {
                // Switch player
                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
            }
        }

        sc.close();
    }

    // Print the game board
    public static void printBoard(char[][] board) {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    // Check if board is full
    public static boolean isBoardFull(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }

    // Check if current player wins
    public static boolean checkWin(char[][] board, char player) {

        // Check rows
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player)
                return true;
        }

        // Check columns
        for (int i = 0; i < 3; i++) {
            if (board[0][i] == player && board[1][i] == player && board[2][i] == player)
                return true;
        }

        // Check diagonals
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player)
            return true;

        if (board[0][2] == player && board[1][1] == player && board[2][0] == player)
            return true;

        return false;
    }
}
