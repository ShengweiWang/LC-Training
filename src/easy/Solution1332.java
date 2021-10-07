package easy;

/**
 * Created by Shengwei_Wang on 6/23/21.
 * v1:2:35
 */
public class Solution1332 {
    public int removePalindromeSub(String s) {
        int l = 0;
        int r = s.length() - 1;
        while (l < r) {
            if(s.charAt(l) != s.charAt(r)) {
                return 2;
            }
            l++;r--;
        }
        return 1;
    }
}
