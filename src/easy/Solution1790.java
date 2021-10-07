package easy;

/**
 * Created by Shengwei_Wang on 6/16/21.
 *
 * v1: wrongly corner case
 */
public class Solution1790 {
    public boolean areAlmostEqual(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        int[] diffIndex = new int[2];
        int diffCount = 0;
        for (int i = 0; i < s1.length(); ++i) {
            if (s1.charAt(i) != s2.charAt(i)) {
                if (diffCount == 2) {
                    return false;
                } else {
                    diffIndex[diffCount] = i;
                    diffCount++;
                    if (diffCount == 2) {
                        if (s1.charAt(diffIndex[0]) != s2.charAt(diffIndex[1]) || s1.charAt(diffIndex[1]) != s2.charAt(diffIndex[0])) {
                            return false;
                        }
                    }
                }
            }
        }
        if (diffCount == 1){
            return false;
        }
        return true;
    }
}
