package easy;

/**
 * Created by Shengwei_Wang on 6/16/21.
 *
 * v1: 2:30
 */
public class Solution1816 {
    public String truncateSentence(String s, int k) {
        String[] splits = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < k - 1; ++i) {
            sb.append(splits[i]).append(" ");
        }
        sb.append(splits[k - 1]);
        return sb.toString();
    }
}
