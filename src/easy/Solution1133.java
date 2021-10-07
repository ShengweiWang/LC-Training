package easy;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Shengwei_Wang on 6/25/21.
 *
 * v1 2:30
 */
public class Solution1133 {
    public int largestUniqueNumber(int[] nums) {
        Map<Integer, Integer> freq = new TreeMap<Integer, Integer>((a,b) -> b -a);
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return -1;
    }
}
