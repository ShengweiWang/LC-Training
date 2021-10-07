package easy;

/**
 * Created by Shengwei_Wang on 6/21/21.
 *
 * v1 4:30
 */
public class Solution1518 {
    public int numWaterBottles(int numBottles, int numExchange) {
        int count = numBottles;
        while (numBottles >= numExchange) {
            int full = numBottles / numExchange;
            count += full;
            numBottles = full + numBottles % numExchange;
        }
        return count;
    }
}
