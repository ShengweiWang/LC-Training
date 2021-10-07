package easy;

import java.util.Arrays;

/**
 * Created by Shengwei_Wang on 6/23/21.
 * v1 4:40
 */
public class Solution1331 {
    public int[] arrayRankTransform(int[] arr) {
        if(arr.length == 0) {
            return arr;
        }
        Integer[] index = new Integer[arr.length];
        for(int i = 0; i < index.length; ++i) {
            index[i] = i;
        }
        Arrays.sort(index, (a, b) -> arr[a] - arr[b]);
        int rank = 1;
        int prev = arr[index[0]];
        arr[index[0]] = 1;
        for(int i = 1; i < index.length; ++i) {
            if (arr[index[i]] != prev) {
                rank++;
                prev = arr[index[i]];
            }
            arr[index[i]] = rank;
        }
        return arr;
    }
}
