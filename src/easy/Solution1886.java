package easy;

/**
 * Created by Shengwei_Wang on 6/15/21.
 *
 * V1
 */
class Solution1886 {
    public boolean findRotation(int[][] mat, int[][] target) {
        boolean l0 = true;
        boolean l1 = true;
        boolean l2 = true;
        boolean l3 = true;
        int n = mat.length;
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                if (l0 && mat[i][j] != target[i][j]) {
                    l0 = false;
                }
                if (l1 && mat[i][j] != target[j][n - 1 - i]) {
                    l1 = false;
                }
                if (l2 && mat[i][j] != target[n - 1 - i][n - 1 - j]) {
                    l2 = false;
                }
                if (l3 && mat[i][j] != target[n - 1 - j][i]) {
                    l3 = false;
                }
                if (!l0 && !l1 && !l2 && !l3) {
                    return false;
                }
            }
        }
        return true;
    }
}
