package easy;

/**
 * Created by Shengwei_Wang on 6/15/21.
 * v1
 */
public class Solution1848 {
    public int getMinDistance(int[] nums, int target, int start) {
        int l = start;
        int r = start;
        while (l >= 0 || r < nums.length) {
            if (l >= 0) {
                if (nums[l] == target) {
                    return start - l;
                } else {
                    --l;
                }
            }
            if (r < nums.length) {
                if (nums[r] == target) {
                    return r - start;
                } else {
                    ++r;
                }
            }
        }
        return 0;
    }
}
