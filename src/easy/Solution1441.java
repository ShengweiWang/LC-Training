package easy;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Shengwei_Wang on 6/21/21.
 * v1 clarify!
 */
public class Solution1441 {
    public List<String> buildArray(int[] target, int n) {
        List<String> result = new LinkedList<>();
        int currIndex = 0;
        for (int i = 1; i <= n; ++i) {
            result.add("Push");
            if (target[currIndex] != i) {
                result.add("Pop");
            } else {
                if (++currIndex == target.length) {
                    return result;
                }
            }
        }
        return result;
    }
}
