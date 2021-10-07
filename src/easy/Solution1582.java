package easy;

/**
 * Created by Shengwei_Wang on 6/20/21.
 *
 * v1 3:00
 */
public class Solution1582 {
    public int numSpecial(int[][] mat) {
        int row = mat.length;
        int col = mat[0].length;
        int[] col_sum = new int[col];
        int[] row_sum = new int[row];
        for(int i = 0; i < row; ++i) {
            for (int j = 0; j < col; ++j) {
                col_sum[j] += mat[i][j];
                row_sum[i] += mat[i][j];
            }
        }
        int count = 0;
        for (int i = 0; i < row; ++i) {
            for (int j = 0; j < col; ++j) {
                if (mat[i][j] == 1 && row_sum[i] == 1 && col_sum[j] == 1) {
                    ++count;
                }
            }
        }
        return count;
    }
}
