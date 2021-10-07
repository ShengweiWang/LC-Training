package easy;

/**
 * Created by Shengwei_Wang on 6/20/21.
 *
 * v1 1:30
 */
public class Solution1672 {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int [] wealth : accounts) {
            int curr = 0;
            for (int money : wealth) {
                curr += money;
            }
            max = Math.max(max, curr);
        }
        return max;
    }
}
