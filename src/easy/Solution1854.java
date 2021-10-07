package easy;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Shengwei_Wang on 6/15/21.
 * v1
 */
public class Solution1854 {
    public int maximumPopulation(int[][] logs) {
        Map<Integer, Integer> change_during_year = new TreeMap<>();
        for(int[] person : logs) {
            change_during_year.put(person[0], change_during_year.getOrDefault(person[0], 0) +1);
            change_during_year.put(person[1], change_during_year.getOrDefault(person[1], 0) -1);
        }
        int curr = 0;
        int max = 0;
        int result = 0;
        for(int year : change_during_year.keySet()) {
            curr += change_during_year.get(year);
            if (curr > max) {
                result = year;
                max = curr;
            }
        }
        return result;
    }
}
