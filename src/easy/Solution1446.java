package easy;

/**
 * Created by Shengwei_Wang on 6/21/21.
 *
 * v1 7:45 clarify requirement!
 */
public class Solution1446 {
    public int maxPower(String s) {
        int i = 0;
        int max = 0;
        while( i < s.length()) {
            int next = i + 1;
            while (next < s.length() && s.charAt(next) == s.charAt(i)) {
                ++next;
            }
            max = Math.max(max, next - i);
            i = next;
        }
        return max;
    }
}
