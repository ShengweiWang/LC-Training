package easy;

/**
 * Created by Shengwei_Wang on 6/20/21.
 *
 * v1 2:50
 */
public class Solution1572 {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum = 0;
        for (int i = 0; i < n; ++i) {
            sum += mat[i][i];
            if (i * 2 + 1 != n) {
                sum += mat[i][n - i - 1];
            }
        }
        return sum;
    }
}
