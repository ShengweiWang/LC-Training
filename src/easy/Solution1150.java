package easy;

/**
 * Created by Shengwei_Wang on 6/24/21.
 * v1 4:51
 */
public class Solution1150 {
    public boolean isMajorityElement(int[] nums, int target) {
        int l = 0;
        int r = nums.length;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] < target) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        if (l + nums.length / 2 >= nums.length || nums[l + nums.length / 2] != target ){
            return false;
        } else {
            return true;
        }
    }
}
