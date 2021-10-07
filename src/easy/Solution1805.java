package easy;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Shengwei_Wang on 6/16/21.
 *
 * v1 15:00
 * Understand the limit!
 */
public class Solution1805 {
    public int numDifferentIntegers(String word) {
        int left = -1;
        Set<String> integers = new HashSet<>();
        for(int i = 0; i < word.length(); ++i) {
            char c = word.charAt(i);
            if (c >= '0' && c <= '9'){
                if (left == -1) {
                    left = i;
                } else {
                    if (word.charAt(left) == '0') {
                        ++left;
                    }
                }
            } else {
                if (left != -1) {
                    integers.add(word.substring(left, i));
                    left = -1;
                }
            }
        }
        if (left != -1) {
            integers.add(word.substring(left));
            left = -1;
        }
        return integers.size();
    }
}
