package easy;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Shengwei_Wang on 6/21/21.
 *
 * v1 8: 08 detailed
 */
public class Solution1450 {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        Map<Integer, Integer> treeMap = new TreeMap<>();
        for (int i = 0; i < startTime.length; ++i) {
            treeMap.put(startTime[i], treeMap.getOrDefault(startTime[i], 0) + 1);
            treeMap.put(endTime[i] + 1, treeMap.getOrDefault(endTime[i] + 1, 0) - 1);
        }
        int curr = 0;
        for (Map.Entry<Integer, Integer> entry: treeMap.entrySet()) {
            if (entry.getKey() > queryTime) {
                return curr;
            }
            curr += entry.getValue();
        }
        return curr;
    }
}
