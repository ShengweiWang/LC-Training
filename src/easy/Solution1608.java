package easy;

import java.util.Arrays;

/**
 * Created by Shengwei_Wang on 6/20/21.
 */
public class Solution1608 {
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        for(int i = nums.length - 1; i >= 0; --i) {
            int x = nums.length - i;
            if (nums[i] >= x && (i == 0 || nums[i - 1] < x)) {
                return x;
            }
        }
        return -1;
    }
}
