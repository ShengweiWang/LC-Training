package easy;

/**
 * Created by Shengwei_Wang on 6/20/21.
 *
 * v1, wrong once.
 */
public class Solution1752 {
    public boolean check(int[] nums) {
        int cliffIndex = -1;
        for (int i = 1; i < nums.length; ++i) {
            if (nums[i] < nums[i - 1]) {
                if (cliffIndex != -1) {
                    return false;
                } else {
                    cliffIndex = i - 1;
                }
            }
        }
        if (cliffIndex == -1 || nums[nums.length - 1] <= nums[0]) {
            return true;
        }
        return false;
    }
}
