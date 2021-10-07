package easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Shengwei_Wang on 6/21/21.
 *
 * v1 3:07
 */
public class Solution1512 {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> counter = new HashMap<>();
        for (int num : nums) {
            counter.put(num, counter.getOrDefault(num, 0) + 1);
        }
        int result = 0;
        for (Map.Entry<Integer, Integer> entry : counter.entrySet()) {
            if (entry.getValue() > 1) {
                result += entry.getValue() * (entry.getValue() - 1) / 2;
            }
        }
        return result;
    }
}
