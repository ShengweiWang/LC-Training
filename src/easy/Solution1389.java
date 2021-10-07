package easy;

/**
 * Created by Shengwei_Wang on 6/22/21.
 * v1 7:00
 */
public class Solution1389 {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[nums.length];
        for(int i = 0; i < nums.length; ++i) {
            for(int j = i; j > index[i]; --j) {
                target[j] = target[j - 1];
            }
            target[index[i]] = nums[i];
        }
        return target;
    }
}
