package easy;

/**
 * Created by Shengwei_Wang on 6/23/21.
 * v1 1:14
 */
public class Solution1281 {
    public int subtractProductAndSum(int n) {
        int prod = 1;
        int sum = 0;
        while (n != 0) {
            int digit = n % 10;
            n /= 10;
            prod *= digit;
            sum += digit;
        }
        return prod - sum;
    }
}
