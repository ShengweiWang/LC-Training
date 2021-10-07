package easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by Shengwei_Wang on 6/24/21.
 * v1 2:20
 */
public class Solution1207 {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> freq = new HashMap<>();
        for(int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        Set<Integer> unique = new HashSet<>();
        for(Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            if(unique.contains(entry.getValue())) {
                return false;
            } else {
                unique.add(entry.getValue());
            }
        }
        return true;
    }
}
