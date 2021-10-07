package easy;

/**
 * Created by Shengwei_Wang on 6/24/21.
 *
 * v1 3:14
 */
public class Solution1180 {
    public int countLetters(String s) {
        int count = 0;
        int prev = 1;
        for(int i = 1; i < s.length(); ++i) {
            if (s.charAt(i) != s.charAt(i - 1)) {
                count += calc(prev);
                prev = 1;
            } else {
                prev++;
            }
        }
        return count + calc(prev);
    }
    private int calc(int prev) {
        return (1 + prev) * prev / 2;
    }
}
