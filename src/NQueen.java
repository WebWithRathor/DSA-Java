import java.util.ArrayList;
import java.util.List;

public class NQueen {
    public static void solve(int[][] board, int row, int colunm, List<List<String>> answer) {
        if (row == board.length) {
            ArrayList<String> as = new ArrayList<>();
            for (int i = 0; i < board.length; i++) {
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < board[0].length; j++) {
                    if (board[i][j] == 1)
                        sb.append("Q");
                    else
                        sb.append(".");
                }
                as.add(sb.toString());
            }
            answer.add(as);
            return;
        }

        System.out.println(row +" "+colunm);

        for (int col = 0; col < board.length; col++) {
            if (isValid(row, col, board)) {
                board[row][col] = 1;
                solve(board, row + 1, col, answer);
                board[row][col] = 0;
            }
        }

    }

    public static boolean isValid(int row, int column, int[][] board) {
        int i = row, j = column;
        while (i >= 0) {
            if (board[i][j] == 1)
                return false;
            i--;
        }
        i = row;
        j = column;
        while (i >= 0 && j >= 0) {
            if (board[i][j] == 1)
                return false;
            i--;
            j--;
        }
        i = row;
        j = column;
        while (i >= 0 && j < board.length) {
            if (board[i][j] == 1)
                return false;
            i--;
            j++;
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 4;
        List<List<String>> answer = new ArrayList<>();
        int[][] board = new int[n][n];
        solve(board, 0, 0, answer);
        System.out.println(answer);
    }
}
