package easy;

/**
 * Created by Shengwei_Wang on 6/15/21.
 * v1
 */
public class Solution1844 {
    public String replaceDigits(String s) {
        char[] chars = s.toCharArray();
        for (int i = 1; i < chars.length; i += 2) {
            chars[i] = (char) (chars[i] - '0' + chars[i - 1]);
        }
        return new String(chars);
    }
}
