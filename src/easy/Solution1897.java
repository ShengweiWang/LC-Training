package easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Shengwei_Wang on 6/25/21.
 *
 * v1 2:51
 */
public class Solution1897 {
    public boolean makeEqual(String[] words) {
        Map<Character, Integer> freq = new HashMap<>();
        for(String s : words) {
            for(int i = 0; i < s.length(); ++i) {
                freq.put(s.charAt(i), freq.getOrDefault(s.charAt(i), 0) + 1);
            }
        }
        for(Map.Entry<Character, Integer> entry : freq.entrySet()) {
            if (entry.getValue() % words.length != 0) {
                return false;
            }
        }
        return true;
    }
}
