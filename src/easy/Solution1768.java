package easy;

/**
 * Created by Shengwei_Wang on 6/17/21.
 *
 * v1 3:00
 */
public class Solution1768 {
    public String mergeAlternately(String word1, String word2) {
        int l = 0;
        int r = 0;
        StringBuilder sb = new StringBuilder();
        while (l < word1.length() || r < word2.length()) {
            if (l < word1.length()) {
                sb.append(word1.charAt(l));
                ++l;
            }
            if (r < word2.length()) {
                sb.append(word2.charAt(r));
                ++r;
            }
        }
        return sb.toString();
    }
}
