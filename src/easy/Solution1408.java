package easy;

import java.util.*;

/**
 * Created by Shengwei_Wang on 6/22/21.
 * v1 19:30, wrong solution at first place. Wrong use of trie
 */
public class Solution1408 {
    public List<String> stringMatching(String[] words) {

        List<String> result = new LinkedList<>();
        Set<String> set = new HashSet<>();
        for(int i = 0; i < words.length; ++i ){
            for (int j = i + 1; j < words.length; ++j) {
                if (words[i].indexOf(words[j]) != -1) {
                    set.add(words[j]);
                } else if (words[j].indexOf(words[i]) != -1) {
                    set.add(words[i]);
                }
            }
        }
        return new ArrayList<>(set);
    }
}
