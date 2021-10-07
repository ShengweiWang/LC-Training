package easy;

/**
 * Created by Shengwei_Wang on 6/22/21.
 *
 * v1 8:50, clarify requirement
 */
public class Solution1422 {
    public int maxScore(String s) {
        int curr = 0;
        int zeroCount = 0;
        int max = -1;
        for (int i = 0; i < s.length() - 1; ++i) {
            if (s.charAt(i) == '0') {
                if(++curr > max) {
                    max = curr;
                }
            } else {
                if(--curr > max) {
                    max = curr;
                }
                zeroCount++;
            }
        }
        zeroCount += s.charAt(s.length() - 1) - '0';
        return zeroCount + max;
    }
}
