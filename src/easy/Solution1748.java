package easy;

/**
 * Created by Shengwei_Wang on 6/20/21.
 *
 * v1: 2:00
 */
public class Solution1748 {
    public int sumOfUnique(int[] nums) {
        int[] buckets = new int[101];
        int sum = 0;
        for (int num : nums) {
            buckets[num]++;
            if (buckets[num] == 1) {
                sum += num;
            } else if (buckets[num] == 2) {
                sum -= num;
            }
        }
        return sum;
    }
}
