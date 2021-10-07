package easy;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.TreeMap;

/**
 * Created by Shengwei_Wang on 6/20/21.
 *
 * v1, 10:00, data structure details
 */
public class Solution1636 {
    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> counter = new HashMap<>();
        for(int num : nums) {
            counter.put(num, counter.getOrDefault(num, 0) + 1);
        }

        Map<Integer, PriorityQueue<Integer>> resultMap = new TreeMap<>();
        for (Map.Entry<Integer, Integer> entry : counter.entrySet()) {
            PriorityQueue<Integer> result = resultMap.getOrDefault(entry.getValue(), new PriorityQueue<>((a,b) -> (b-a)));
            result.add(entry.getKey());
            resultMap.put(entry.getValue(), result);
        }
        int[] result = new int[nums.length];
        int i = 0;
        for (Map.Entry<Integer, PriorityQueue<Integer>> entry : resultMap.entrySet()) {
            PriorityQueue<Integer> q = entry.getValue();
            while (!q.isEmpty()) {
                int v = q.poll();
                for (int j = 0; j < entry.getKey(); j++) {
                    result[i++] = v;
                }
            }
        }
        return result;
    }
}
