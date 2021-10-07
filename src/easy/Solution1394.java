package easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Shengwei_Wang on 6/22/21.
 *
 * v1 2:30
 */
public class Solution1394 {
    public int findLucky(int[] arr) {
        Map<Integer, Integer> freq = new HashMap<Integer, Integer>();
        for(int a : arr) {
            freq.put(a, freq.getOrDefault(a, 0) + 1);
        }
        int max = -1;
        for(Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            if (entry.getKey() == entry.getValue()) {
                max = Math.max(max, entry.getKey());
            }
        }
        return max;
    }
}
