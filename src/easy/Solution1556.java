package easy;

/**
 * Created by Shengwei_Wang on 6/20/21.
 *
 * v1 11:00 details!
 */
public class Solution1556 {
    public String thousandSeparator(int n) {
        String s = "";
        while(n > 1000) {
            int mod = n % 1000;
            n /= 1000;
            if (mod < 10) {
                s = ".00" + mod + s;
            } else if (mod < 100) {
                s = ".0" + mod + s;
            } else {
                s = "." + mod + s;
            }
        }
        return n + s;
    }
}
