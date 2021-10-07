package easy;

/**
 * Created by Shengwei_Wang on 6/21/21.
 *
 * v 4:37 + previous
 */
public class Solution1539 {
    public int findKthPositive(int[] arr, int k) {
        int next = 1;
        for (int num : arr) {
            if (num - next >= k) {
                return next + k - 1;
            } else {
                k -= (num - next);
                next = num + 1;
            }
        }
        return next + k - 1;
    }
}
