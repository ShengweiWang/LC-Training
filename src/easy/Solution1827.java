package easy;

/**
 * Created by Shengwei_Wang on 6/15/21.
 * v1 3:20
 */
public class Solution1827 {
    public int minOperations(int[] nums) {
        int result = 0;
        int curr = 0;
        for (int num : nums) {
            if (num > curr) {
                curr = num;
            } else {
                ++curr;
                result += (curr - num);
            }
        }
        return result;
    }
}
