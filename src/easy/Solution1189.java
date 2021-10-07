package easy;

/**
 * Created by Shengwei_Wang on 6/24/21.
 * v1 5:00
 */
public class Solution1189 {
    public int maxNumberOfBalloons(String text) {
        int[] bucket = new int[26];
        for(int i = 0; i < text.length(); ++i) {
            bucket[text.charAt(i) - 'a']++;
        }
        int[] target = new int[]{'b' - 'a', 'a' - 'a', 'l' - 'a', 'o' - 'a', 'n' - 'a'};
        bucket['l' - 'a'] /= 2;
        bucket['o' - 'a'] /= 2;
        int min = text.length();
        for(int i : target) {
            min = Math.min(min, bucket[i]);
        }
        return min;
    }
}
