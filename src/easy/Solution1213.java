package easy;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Shengwei_Wang on 6/23/21.
 * v1 7:24
 */
public class Solution1213 {
    public List<Integer> arraysIntersection(int[] arr1, int[] arr2, int[] arr3) {
        List<Integer> result = new LinkedList<>();
        int i1 = 0;
        int i2= 0;
        int i3 = 0;
        while(i1 < arr1.length && i2 < arr2.length && i3 < arr3.length) {
            if (arr1[i1] == arr2[i2] && arr1[i1] == arr3[i3]) {
                result.add(arr1[i1]);
                ++i1;
                ++i2;
                ++i3;
                continue;
            }
            int max = Math.max(arr1[i1], Math.max(arr2[i2], arr3[i3]));
            while(i1 < arr1.length && arr1[i1] < max) {
                ++i1;
            }
            while(i2 < arr2.length && arr2[i2] < max) {
                ++i2;
            }
            while(i3 < arr3.length && arr3[i3] < max) {
                ++i3;
            }
        }
        return result;
    }
}
