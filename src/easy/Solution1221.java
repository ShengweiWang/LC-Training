package easy;

/**
 * Created by Shengwei_Wang on 6/23/21.
 * v1 2:17
 */
public class Solution1221 {
    public int balancedStringSplit(String s) {
        int count = 0;
        int balance = 0;
        for(int i = 0; i < s.length(); ++i) {
            balance += s.charAt(i) == 'R' ? 1 : -1;
            if(balance == 0) {
                ++count;
            }
        }
        return count;
    }
}
