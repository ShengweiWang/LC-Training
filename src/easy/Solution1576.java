package easy;

/**
 * Created by Shengwei_Wang on 6/20/21.
 *
 * v1 4:50
 */
public class Solution1576 {
    public String modifyString(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; ++i) {
            if (chars[i] == '?') {
                chars[i] = 'a';
                while((i > 0 && chars[i] == chars[i - 1]) || ((i < chars.length - 1) && chars[i] == chars[i + 1])) {
                    chars[i]++;
                }
            }
        }
        return new String(chars);
    }
}
