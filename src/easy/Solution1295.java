package easy;

/**
 * Created by Shengwei_Wang on 6/23/21.
 * v1 3:04
 */
public class Solution1295 {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            int digits = 0;
            while(num != 0) {
                digits++;
                num /= 10;
            }
            count += (digits + 1) % 2;
        }
        return count;
    }
}
