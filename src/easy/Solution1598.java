package easy;

/**
 * Created by Shengwei_Wang on 6/20/21.
 *
 * v1 1:00
 */
public class Solution1598 {
    public int minOperations(String[] logs) {
        int curr = 0;
        for (String log : logs) {
            if(log.charAt(0) == '.') {
                if (log.charAt(1) == '.') {
                    curr = curr == 0 ? 0 : curr -1;
                }
            } else {
                curr ++;
            }
        }
        return curr;
    }
}
