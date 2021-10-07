package easy;

/**
 * Created by Shengwei_Wang on 6/16/21.
 *
 * v1: 1:45
 */
public class Solution1822 {
    public int arraySign(int[] nums) {
        int result = 1;
        for (int num : nums) {
            if (num == 0) {
                return 0;
            } else if (num < 0) {
                result = - result;
            }
        }
        return result;
    }
}
