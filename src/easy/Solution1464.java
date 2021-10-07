package easy;

/**
 * Created by Shengwei_Wang on 6/21/21.
 * v1 2:40
 */
public class Solution1464 {
    public int maxProduct(int[] nums) {
        int[] max = new int[2];
        for (int num : nums) {
            if (num >= max[0]) {
                max[1] = max[0];
                max[0] = num;
            } else if (num > max[1]) {
                max[1] = num;
            }
        }
        return (max[0] - 1 ) * (max[1] - 1);
    }
}
