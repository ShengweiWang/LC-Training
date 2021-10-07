package easy;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Shengwei_Wang on 6/15/21.
 *
 * V1
 */
public class Solution1876 {
    private final static int SUB_LENGTH = 3;
    public int countGoodSubstrings(String s) {
        if (s.length() < SUB_LENGTH) {
            return 0;
        }
        int[] bucket = new int[26];
        Set<Integer> inFlyChar = new HashSet<>();
        char[] chars = s.toCharArray();
        int l = 0;
        int r = 0;
        for (; r < SUB_LENGTH; r++) {
            int rChar = chars[r] - 'a';
            bucket[rChar]++;
            inFlyChar.add(rChar);
        }
        int result = 0;
        if (inFlyChar.size() == 3) {
            result ++;
        }
        for (; r <s.length(); r++) {
            int lChar = chars[l] - 'a';
            int rChar = chars[r] - 'a';
            if (--bucket[lChar] == 0) {
                inFlyChar.remove(lChar);
            }
            if (++bucket[rChar] == 1) {
                inFlyChar.add(rChar);
            }
            if (inFlyChar.size() == SUB_LENGTH) {
                result++;
            }
            ++l;
        }
        return result;
    }
}
