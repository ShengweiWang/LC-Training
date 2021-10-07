package easy;

/**
 * Created by Shengwei_Wang on 6/21/21.
 *
 * v1 1:20
 */
public class Solution1480 {
    public int[] runningSum(int[] nums) {
        int[] res = new int[nums.length];
        res[0] = nums[0];
        for(int i = 1; i < nums.length; ++i) {
            res[i] = res[i - 1] + nums[i];
        }
        return res;
    }
}
