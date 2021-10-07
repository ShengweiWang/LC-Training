package easy;

/**
 * Created by Shengwei_Wang on 6/22/21.
 * v1 3:45
 */
public class Solution1413 {
    public int minStartValue(int[] nums) {
        int curr = 0;
        int min = Integer.MAX_VALUE;
        for(int num : nums) {
            curr += num;
            min = Math.min(min, curr);
        }
        return Math.max(1, 1 - min);
    }
}
