package easy;

/**
 * Created by Shengwei_Wang on 6/17/21.
 *
 * v1 4:00
 */
public class Solution1784 {
    public boolean checkOnesSegment(String s) {
        int curr = 1;
        while (curr != s.length() && s.charAt(curr) == '1') {
            ++curr;
        }
        if (curr == s.length()) {
            return true;
        }
        while (curr != s.length() && s.charAt(curr) == '0') {
            ++curr;
        }
        if (curr == s.length()) {
            return true;
        }
        return false;
    }
}
