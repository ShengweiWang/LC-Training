package easy;

/**
 * Created by Shengwei_Wang on 6/17/21.
 *
 * v1 4:45
 */
public class Solution1758 {
    public int minOperations(String s) {
        int startWith0 = 0;
        int startWith1 = 0;
        for(int i = 0; i < s.length(); ++i) {
            if ((s.charAt(i) - '0' + i) % 2 == 0) {
                startWith1++;
            } else {
                startWith0++;
            }
        }
        return Math.min(startWith1, startWith0);
    }
}
