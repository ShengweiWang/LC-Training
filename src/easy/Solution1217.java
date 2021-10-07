package easy;

/**
 * Created by Shengwei_Wang on 6/23/21.
 * v1 2:30
 */
public class Solution1217 {
    public int minCostToMoveChips(int[] position) {
        int odd = 0;
        for(int p : position) {
            odd += p % 2;
        }
        return Math.min(odd, position.length - odd);
    }
}
