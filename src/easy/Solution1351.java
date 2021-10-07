package easy;

/**
 * Created by Shengwei_Wang on 6/22/21.
 *
 * v1 6:10, binary search
 */
public class Solution1351 {
    public int countNegatives(int[][] grid) {
        int count = 0;
        for(int[] row : grid) {
            int l = 0;
            int r = row.length;
            while (l < r) {
                int mid = l + (r - l) / 2;
                if (row[mid] < 0) {
                    r = mid;
                } else {
                    l = mid + 1;
                }
            }
            count += row.length - l;
        }
        return count;
    }
}
