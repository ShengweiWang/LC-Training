package easy;

/**
 * Created by Shengwei_Wang on 6/20/21.
 *
 * v1 1:30
 */
public class Solution1732 {
    public int largestAltitude(int[] gain) {
        int curr = 0;
        int max = 0;
        for (int increase : gain) {
            curr += increase;
            if (curr > max) {
                max = curr;
            }
        }
        return max;
    }
}
