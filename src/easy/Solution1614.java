package easy;

/**
 * Created by Shengwei_Wang on 6/20/21.
 *
 * v1, 2:50
 */
public class Solution1614 {
    public int maxDepth(String s) {
        int max = 0;
        int curr = 0;
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == '(') {
                max = Math.max(max, ++curr);
            } else if (s.charAt(i) == ')') {
                --curr;
            }
        }
        return max;
    }
}
