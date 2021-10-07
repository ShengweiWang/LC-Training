package easy;

/**
 * Created by Shengwei_Wang on 6/21/21.
 *
 * v 19:20
 */
public class Solution1470 {
    public int[] shuffle(int[] nums, int n) {
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] < 0) {
                continue;
            } else {
                int curr = i;
                int value = nums[curr];
                while (value > 0) {
                    int next;
                    if (curr < n) {
                        next = curr * 2;
                    } else {
                        next = (curr - n) * 2 + 1;
                    }
                    int temp = nums[next];
                    nums[next] = -value;
                    value = temp;
                    curr = next;
                }
            }
        }
        for (int i = 0; i < nums.length; ++i) {
            nums[i] = - nums[i];
        }
        return nums;
    }
}
