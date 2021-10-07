package easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Shengwei_Wang on 6/20/21.
 *
 * v1 7:00
 */
public class Solution1640 {
    public boolean canFormArray(int[] arr, int[][] pieces) {
        Map<Integer, int[]> pMap = new HashMap<>();
        for(int[] piece : pieces) {
            pMap.put(piece[0], piece);
        }
        int i = 0;
        while(i < arr.length) {
            int[] piece = pMap.get(arr[i]);
            if (piece == null) {
                return false;
            } else {
                pMap.remove(arr[i]);
            }
            for(int j = 0; j < piece.length; ++j) {
                if (arr[i++] != piece[j]) {
                    return false;
                }
            }
        }
        return pMap.size() == 0;
    }
}
