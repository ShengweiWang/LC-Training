package easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Shengwei_Wang on 6/21/21.
 *
 * v1 3:20
 */
public class Solution1460 {
    public boolean canBeEqual(int[] target, int[] arr) {
        Map<Integer, Integer> fre = new HashMap<Integer, Integer>();
        for (int num : arr) {
            fre.put(num, fre.getOrDefault(num, 0) + 1);
        }
        for (int num : target) {
            int rem = fre.getOrDefault(num, 0);
            if (rem == 0) {
                return false;
            }
            fre.put(num, rem - 1);
        }
        return true;
    }
}
