package easy;

/**
 * Created by Shengwei_Wang on 6/20/21.
 *
 * v1 2:30
 */
public class Solution1688 {
    public int numberOfMatches(int n) {
        int result = 0;
        while (n != 1) {
            result += n / 2;
            n = (n + 1) / 2;
        }
        return result;
    }

}
