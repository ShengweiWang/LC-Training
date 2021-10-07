package easy;

/**
 * Created by Shengwei_Wang on 6/23/21.
 * v1 10:11
 */
public class Solution1275 {
    public String tictactoe(int[][] moves) {
        // +1 for A, -1 for B, first get to 3 -> A, -3 -> B
        int[] row = new int[3];
        int[] col = new int[3];
        int dig = 0;
        int anti_dig = 0;
        int turn = 1;
        for(int i = 0; i < moves.length; ++i) {
            int x = moves[i][0];
            int y = moves[i][1];
            row[x] += turn;
            col[y] += turn;
            if (x == y) {
                dig += turn;
            }
            if (x + y == 2) {
                anti_dig += turn;
            }
            if (Math.abs(row[x]) == 3 || Math.abs(col[y]) == 3 || Math.abs(dig) == 3 || Math.abs(anti_dig) == 3) {
                return turn == 1 ? "A" : "B";
            }
            turn = - turn;
        }
        return moves.length == 9 ? "Draw" : "Pending";
    }
}
