package easy;

/**
 * Created by Shengwei_Wang on 6/20/21.
 * v1 4:30
 */
public class Solution1624 {
    public int maxLengthBetweenEqualCharacters(String s) {
        int[] firstIndex = new int[26];
        int result = -1;
        for (int i = 0; i < 26; ++i) {
            firstIndex[i] = -1;
        }
        for (int i = 0; i < s.length(); ++i) {
            int index = s.charAt(i) - 'a';
            if(firstIndex[index] == -1) {
                firstIndex[index] = i;
            } else {
                result = Math.max(result, i - firstIndex[index] - 1);
            }
        }
        return result;
    }
}
