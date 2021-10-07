package easy;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Shengwei_Wang on 6/25/21.
 *
 * v1 2:40
 */
public class Solution1134 {
    public boolean isArmstrong(int n) {
        int nn = n;
        int k = 0;
        List<Integer> digits = new LinkedList<>();
        while ( n > 0) {
            k++;
            digits.add(n % 10);
            n /= 10;
        }
        for(Integer c : digits) {
            nn -= Math.pow(c, k);
        }
        return nn == 0;
    }
}
