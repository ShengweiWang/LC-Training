package easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Shengwei_Wang on 6/25/21.
 */
public class Solution1128 {
    public int numEquivDominoPairs(int[][] dominoes) {
        Map<String, Integer> freq = new HashMap<>();
        for(int[] d : dominoes) {
            String key;
            if (d[0] < d[1]) {
                key = d[0] + " " + d[1];
            } else {
                key = d[1] + " " + d[0];
            }
            freq.put(key, freq.getOrDefault(key, 0) + 1);
        }
        int result = 0;
        for (Map.Entry<String,Integer> entry : freq.entrySet()) {
            if (entry.getValue() > 1) {
                result += entry.getValue() * (entry.getValue() - 1) / 2;
            }
        }
        return result;
    }
}
