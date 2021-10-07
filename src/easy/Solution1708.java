package easy;

/**
 * Created by Shengwei_Wang on 6/20/21.
 *
 * v1 5:20
 */
public class Solution1708 {
    public int[] largestSubarray(int[] nums, int k) {
        int maxFirstIndex = 0;
        for (int i = 0; i <= nums.length - k; ++i) {
            if (nums[i] > nums[maxFirstIndex]) {
                maxFirstIndex = i;
            }
        }
        int[] result = new int[k];
        for (int i = 0; i < k; ++i) {
            result[i] = nums[maxFirstIndex + i];
        }
        return result;
    }
}
