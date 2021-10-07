package easy;

import java.util.Arrays;
import java.util.Stack;

/**
 * Created by Shengwei_Wang on 6/21/21.
 *
 * v1 9:13
 */
public class Solution1475 {
    public int[] finalPrices(int[] prices) {
        Stack<Integer> indexStack = new Stack<>();
        int[] results = Arrays.copyOf(prices, prices.length);
        for(int i = 0; i < prices.length; ++i) {
            while(!indexStack.isEmpty() && prices[indexStack.peek()] >= prices[i]) {
                results[indexStack.pop()] -= prices[i];
            }
            indexStack.push(i);
        }
        return results;
    }
}
