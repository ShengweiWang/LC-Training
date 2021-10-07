package easy;

/**
 * Created by Shengwei_Wang on 6/15/21.
 * v1
 */
public class Solution1869 {
    public boolean checkZeroOnes(String s) {
        int[] maxL = new int[] {0, 0};
        char[] chars = s.toCharArray();
        int curr = 1;
        for (int i = 1; i <= s.length(); ++i) {
            if (i == s.length() || chars[i] != chars[i - 1]) {
                int index = chars[i-1] - '0';
                maxL[index] = Math.max(maxL[index], curr);
                curr = 1;
            } else {
                ++curr;
            }
        }
        return maxL[1] > maxL[0];
    }
}
