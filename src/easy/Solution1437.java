package easy;

/**
 * Created by Shengwei_Wang on 6/21/21.
 *
 * v1 3:00
 */
public class Solution1437 {
    public boolean kLengthApart(int[] nums, int k) {
        int prev = -k - 1;
        for(int i = 0; i < nums.length; ++i) {
            if (nums[i] == 1) {
                if (i - prev <= k) {
                    return false;
                } else {
                    prev = i;
                }
            }
        }
        return true;
    }
}
