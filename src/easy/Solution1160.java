package easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Shengwei_Wang on 6/24/21.
 */
public class Solution1160 {
    public int countCharacters(String[] words, String chars) {
        HashMap<Character, Integer> freq = checkFreq(chars);
        int sum = 0;
        for(String word : words) {
            HashMap<Character, Integer> wordFreq = checkFreq(word);

            boolean good = true;
            for(Map.Entry<Character, Integer> entry : wordFreq.entrySet()) {
                if (freq.getOrDefault(entry.getKey(), 0) < entry.getValue()) {
                    good = false;
                    break;
                }
            }
            if (good) {
                sum += word.length();
            }
        }
        return sum;
    }
    private HashMap<Character, Integer> checkFreq(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); ++i) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        return map;
    }
}
