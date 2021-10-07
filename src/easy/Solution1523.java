package easy;

/**
 * Created by Shengwei_Wang on 6/21/21.
 *
 * v1 3:50
 */
public class Solution1523 {
    public int countOdds(int low, int high) {
        return (high - low) / 2 + (low | high) % 2;
    }
}
