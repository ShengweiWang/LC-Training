package easy;

/**
 * Created by Shengwei_Wang on 6/20/21.
 *
 * v1 6:00
 */
public class Solution1662 {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int w2Index = 0;
        int c2Index = 0;

        for (String word : word1) {
            for (int i = 0; i < word.length(); ++i) {
                if(w2Index == word2.length) {
                    return false;
                }
                if(word.charAt(i) != word2[w2Index].charAt(c2Index++)) {
                    return false;
                }
                if (c2Index == word2[w2Index].length()) {
                    w2Index++;
                    c2Index = 0;
                }
            }
        }
        return w2Index == word2.length;
    }
}
