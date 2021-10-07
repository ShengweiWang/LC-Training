package easy;

import java.util.List;

/**
 * Created by Shengwei_Wang on 6/17/21.
 *
 * v1, 3:00
 */
public class Solution1773 {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int ruleIndex = ruleKey.equals("type")?0:ruleKey.equals("color")?1:2;
        int result = 0;
        for(List<String> item : items) {
            if (item.get(ruleIndex).equals(ruleValue)) {
                ++result;
            }
        }
        return result;
    }
}
