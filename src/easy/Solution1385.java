package easy;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Shengwei_Wang on 6/22/21.
 *
 * v1 7:30, needs optimiztion
 */
public class Solution1385 {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Set<Integer> valid = new HashSet<>();
        for(int num : arr2) {
            for (int i = -d; i <= d; ++i) {
                valid.add(num + i);
            }
        }
        int count = 0;
        for (int num : arr1) {
            if (!valid.contains(num)) {
                ++count;
            }
        }
        return count;

    }
}
