package easy;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Shengwei_Wang on 6/24/21.
 * v1 3:50
 */
public class Solution1200 {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int minDiff = arr[1] - arr[0];
        List<List<Integer>> result = new LinkedList<>();
        for(int i = 1; i < arr.length; ++i) {
            minDiff = Math.min(minDiff, arr[i] - arr[i - 1]);
        }
        for(int i = 1; i < arr.length; ++i) {
            if (arr[i] - arr[i - 1] == minDiff) {
                result.add(List.of(arr[i - 1], arr[i]));
            }
        }
        return result;
    }
}
