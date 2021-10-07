package easy;

/**
 * Created by Shengwei_Wang on 6/23/21.
 * v1 5:08
 */
public class Solution1252 {
    public int oddCells(int m, int n, int[][] indices) {
        boolean[] row = new boolean[m];
        boolean[] col = new boolean[n];
        for(int i = 0; i < indices.length; ++i) {
            row[indices[i][0]] = !row[indices[i][0]];
            col[indices[i][1]] = !col[indices[i][1]];
        }
        int sum = 0;
        for(int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                if(row[i] ^ col[j]) {
                    ++sum;
                }
            }
        }
        return sum;
    }
}
