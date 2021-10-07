package easy;

/**
 * Created by Shengwei_Wang on 6/15/21.
 * v1
 */
public class Solution1863 {
    public int subsetXORSum(int[] nums) {
        int seed = 0;
        for (int num : nums) {
            seed |= num;
        }
        return (int) (Math.pow(2, nums.length - 1) * seed);
    }
}
