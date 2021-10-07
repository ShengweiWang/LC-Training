package easy;

/**
 * Created by Shengwei_Wang on 6/24/21.
 */
public class Solution1165 {
    public int calculateTime(String keyboard, String word) {
        // location of each char
        int[] l = new int[26];
        for(int i = 0; i < keyboard.length(); ++i) {
            l[keyboard.charAt(i) - 'a'] = i;
        }

        // check time
        int total = l[word.charAt(0) - 'a'];
        for(int i = 1; i < word.length(); ++i) {
            total += Math.abs(l[word.charAt(i) - 'a'] - l[word.charAt(i - 1) - 'a']);
        }
        return total;
    }
}
