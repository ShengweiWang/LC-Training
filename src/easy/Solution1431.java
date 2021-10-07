package easy;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Shengwei_Wang on 6/22/21.
 *
 * v1 2:40
 */
public class Solution1431 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = candies[0];
        for (int candy : candies) {
            max = Math.max(max, candy);
        }
        int leastRequired = max - extraCandies;
        List<Boolean> result = new LinkedList<>();
        for(int i = 0; i < candies.length; ++i) {
            result.add(candies[i] >= leastRequired);
        }
        return result;
    }
}
