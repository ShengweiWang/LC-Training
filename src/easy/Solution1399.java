package easy;

/**
 * Created by Shengwei_Wang on 6/22/21.
 *
 * v1 15
 */
public class Solution1399 {
    public int countLargestGroup(int n) {
        int[] dp = new int[n + 1];
        int[] bucket = new int[40];
        int max = 0;
        for (int i = 1; i <= n; ++i) {
            max = Math.max(max, ++bucket[check(i, dp)]);
        }
        int count = 0;
        for(int b : bucket) {
            if (b == max) {
                ++count;
            }
        }
        return count;

    }
    private int check(int i, int[] dp) {
        if (dp[i] != 0) {
            return dp[i];
        } else {
            if (i < 10) {
                dp[i] = i;
            } else {
                dp[i] = i%10 + check(i/10, dp);
            }
            return dp[i];
        }
    }
}
