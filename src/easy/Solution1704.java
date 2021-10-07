package easy;

import java.util.Set;

/**
 * Created by Shengwei_Wang on 6/20/21.
 *
 * v1 4:00
 */
public class Solution1704 {
    public boolean halvesAreAlike(String s) {
        int half = s.length() / 2;
        int count = 0;
        Set<Character> vowelSet = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        for (int i = 0; i < half; ++i) {
            if (vowelSet.contains(s.charAt(i))) {
                count++;
            }
        }
        for (int i = half; i <s.length(); ++i) {
            if(vowelSet.contains(s.charAt(i))) {
                count--;
            }
        }
        return count == 0;
    }
}
