package easy;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Shengwei_Wang on 6/20/21.
 */
public class Solution1656 {
        String[] str;
        int ptr = 0;
        public Solution1656(int n) {
            str = new String[n];
        }

        public List<String> insert(int idKey, String value) {
            idKey--;
            str[idKey] = value;
            if (ptr != idKey) {
                return Collections.EMPTY_LIST;
            } else {
                List<String> results = new LinkedList<>();
                while(ptr < str.length && str[ptr] != null) {
                    results.add(str[ptr++]);
                }
                return results;
            }
        }


/**
 * Your OrderedStream object will be instantiated and called as such:
 * OrderedStream obj = new OrderedStream(n);
 * List<String> param_1 = obj.insert(idKey,value);
 */
}
