package easy;

/**
 * Created by Shengwei_Wang on 6/16/21.
 *
 * v1, failed 1 (requirement clarify), 5:00
 */
public class Solution1796 {
    public int secondHighest(String s) {
        char first = 0;
        char second = 0;
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                if (s.charAt(i) > first) {
                    second = first;
                    first = s.charAt(i);
                } else if (s.charAt(i) != first && s.charAt(i) > second) {
                    second = s.charAt(i);
                }
            }
        }
        return second == 0 ? -1: second - '0';
    }
}
