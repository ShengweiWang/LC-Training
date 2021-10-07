package easy;

import java.util.Set;

/**
 * Created by Shengwei_Wang on 6/25/21.
 *
 * v1 1:50
 */
public class Solution1119 {
    public String removeVowels(String s) {
        StringBuilder sb = new StringBuilder();
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');
        for(int i = 0; i < s.length(); ++i) {
            if (!vowels.contains(s.charAt(i))) {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
