package easy;

import java.util.PriorityQueue;

/**
 * Created by Shengwei_Wang on 6/22/21.
 *
 * v1 13:40
 */
public class Solution1337 {
    public int[] kWeakestRows(int[][] mat, int k) {
        int[] soldiers = new int[mat.length];
        PriorityQueue<Integer> indexs = new PriorityQueue<Integer>(
                (a, b) -> soldiers[a] == soldiers[b] ? b - a : soldiers[b] - soldiers[a]
        );
        for(int i = 0; i < mat.length; ++i) {
            for (int j = 0; j < mat[i].length; ++j) {
                if (mat[i][j] == 0) {
                    break;
                }
                soldiers[i]++;
            }
            indexs.offer(i);
            if(indexs.size() > k) {
                indexs.poll();
            }
        }
        int[] result = new int[k];
        for(int i = k - 1; i >= 0; --i) {
            result[i] = indexs.poll();
        }
        return result;
    }
}
