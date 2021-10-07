package easy;

/**
 * Created by Shengwei_Wang on 6/23/21.
 * v1 13:00 details!
 */
public class Solution1317 {
    public int[] getNoZeroIntegers(int n) {
        if (n < 10) {
            return new int[] {1, n - 1};
        }
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        while(n > 9) {
            int digit = n % 10;
            if (digit < 2) {
                sb1.append(2);
                sb2.append(10 + digit - 2);
            } else if (digit == 2) {
                sb1.append(1);
                sb2.append(1);
            } else {
                sb1.append(2);
                sb2.append(digit - 2);
            }
            if (digit < 2) {
                n = n / 10 - 1;
            } else {
                n = n / 10;
            }
        }
        if (n > 0) {
            sb1.append(n);
        }
        return new int[]{Integer.valueOf(sb1.reverse().toString()), Integer.valueOf(sb2.reverse().toString())};
    }
}
