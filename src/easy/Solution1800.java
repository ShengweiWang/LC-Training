package easy;

/**
 * Created by Shengwei_Wang on 6/16/21.
 * v1 3:00
 * follow up
 */
public class Solution1800 {
    public int maxAscendingSum(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int max = nums[0];
        int sum = max;
        for (int i = 1; i < nums.length; ++i) {
            if (nums[i] > nums[i - 1]) {
                sum += nums[i];
            } else {
                sum = nums[i];
            }
            max = Math.max(max, sum);
        }
        return max;
    }
}
