package easy;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Shengwei_Wang on 6/20/21.
 *
 * v1 8:00
 */
public class Solution1560 {
    public List<Integer> mostVisited(int n, int[] rounds) {
        List<Integer> result = new LinkedList<>();
        if (rounds[0] < rounds[rounds.length - 1]) {
            for (int i = rounds[0]; i <= rounds[rounds.length - 1]; ++i) {
                result.add(i);
            }
        } else if (rounds[0] == rounds[rounds.length - 1]) {
            result.add(rounds[0]);
        } else {
            for (int i = 1; i <= rounds[rounds.length - 1]; ++i) {
                result.add(i);
            }
            for (int i = rounds[0]; i <= n; ++i) {
                result.add(i);
            }
        }
        return result;
    }
}
