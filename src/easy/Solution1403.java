package easy;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Shengwei_Wang on 6/22/21.
 *
 * v1 10:00
 */
public class Solution1403 {
    public List<Integer> minSubsequence(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for(int num : nums) {
            sum += num;
        }
        int target = sum/2 + 1;
        List<Integer> result = new LinkedList<>();
        for (int i = nums.length - 1; i >= 0; --i) {
            int num = nums[i];
            result.add(num);
            target -= num;
            if (target <= 0) {
                return result;
            }
        }
        return result;
    }
}
