package easy;

/**
 * Created by Shengwei_Wang on 6/21/21.
 *
 * v1 3:00
 */
public class Solution1528 {
    public String restoreString(String s, int[] indices) {
        char[] result = new char[s.length()];
        for(int i = 0; i < s.length(); ++i) {
            result[indices[i]] = s.charAt(i);
        }
        return new String(result);
    }
}
