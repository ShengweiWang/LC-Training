package easy;

/**
 * Created by Shengwei_Wang on 6/23/21.
 * v1 2:45
 */
public class Solution1313 {
    public int[] decompressRLElist(int[] nums) {
        int n = 0;
        for(int i = 0; i < nums.length; i = i + 2) {
            n += nums[i];
        }
        int[] result = new int[n];
        int curr = 0;
        for(int i = 0; i < nums.length; i = i + 2) {
            for(int k = 0; k < nums[i]; ++k) {
                result[curr++] = nums[i + 1];
            }
        }
        return result;
    }
}
