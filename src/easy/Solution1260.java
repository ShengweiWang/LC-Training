package easy;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Shengwei_Wang on 6/23/21.
 *
 * v1 7:41
 */
public class Solution1260 {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int n = grid[0].length;
        int m = grid.length;
        List<List<Integer>> results = new LinkedList<>();
        // global coding: x * n + y; -> total n * m;
        for(int i = 0; i < grid.length; ++i) {
            List<Integer> line = new LinkedList<>();
            results.add(line);
            for(int j = 0; j < grid[0].length; ++j) {
                int code = ((i * n + j - k) % (n * m) + n * m ) % (n * m);
                line.add(grid[code / n][code % n]);
            }
        }
        return results;
    }
}
