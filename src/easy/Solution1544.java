package easy;

/**
 * Created by Shengwei_Wang on 6/20/21.
 * v1 4:30
 */
public class Solution1544 {
    public String makeGood(String s) {
        for (int i = 0; i < s.length() - 1; ++i) {
            if(Math.abs(s.charAt(i) - s.charAt(i + 1)) == Math.abs('a' - 'A')) {
                return makeGood(s.substring(0, i) + s.substring(i + 2));
            }
        }
        return s;
    }
}
