package easy;

/**
 * Created by Shengwei_Wang on 6/25/21.
 *
 * v1 2:24
 */
public class Solution1893 {
    public boolean isCovered(int[][] ranges, int left, int right) {
        boolean[] covered = new boolean[51];
        for(int[] range : ranges) {
            for(int i = Math.max(left, range[0]); i <= Math.min(right, range[1]); ++i) {
                covered[i] = true;
            }
        }
        for(int i = left; i <= right; ++i) {
            if(!covered[i]) {
                return false;
            }
        }
        return true;
    }
}
