package easy;

import java.util.Arrays;

/**
 * Created by Shengwei_Wang on 6/21/21.
 *
 * v1 1:50
 */
public class Solution1502 {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int diff = arr[1] - arr[0];
        for(int i = 2; i < arr.length; ++i) {
            if (arr[i] - arr[i - 1] != diff) {
                return false;
            }
        }
        return true;
    }
}
