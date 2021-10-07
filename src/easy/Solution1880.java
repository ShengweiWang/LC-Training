package easy;

/**
 * Created by Shengwei_Wang on 6/15/21.
 * V1
 */
public class Solution1880 {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        return convert(firstWord) + convert(secondWord) == convert(targetWord);
    }

    private int convert(String s) {
        char[] chars = s.toCharArray();
        int result = 0;
        for (char c : chars) {
            if (c == 'a' && result == 0) {
                continue;
            }
            result = result * 10 + c - 'a';
        }
        return result;
    }
}
