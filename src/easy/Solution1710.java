package easy;

import java.util.Arrays;

/**
 * Created by Shengwei_Wang on 6/20/21.
 *
 * v1 4:47
 */
public class Solution1710 {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);
        int result_units = 0;
        for (int[] box : boxTypes) {
            if (truckSize >= box[0]) {
                result_units += box[0] * box[1];
                truckSize -= box[0];
            } else {
                result_units += truckSize * box[1];
                break;
            }
        }
        return result_units;
    }

}
