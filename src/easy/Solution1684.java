package easy;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Shengwei_Wang on 6/20/21.
 *
 * v 5:30
 *
 */
public class Solution1684 {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> allowedSet = new HashSet<>();
        for (int i = 0 ; i < allowed.length(); ++i) {
            allowedSet.add(allowed.charAt(i));
        }
        int count = 0;
        for (String word : words) {
            if (check(word, allowedSet)) {
                count++;
            }
        }
        return count;
    }

    private boolean check(String word, Set<Character> allowedSet) {
        for (int i = 0; i < word.length(); ++i) {
            if (!allowedSet.contains(word.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
