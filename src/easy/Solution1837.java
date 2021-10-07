package easy;

/**
 * Created by Shengwei_Wang on 6/15/21.
 */
public class Solution1837 {
    public int sumBase(int n, int k) {
        int result = 0;
        while ( n > 0) {
            result += n % k;
            n /= k;
        }
        return result;
    }
}
