package easy;

/**
 * Created by Shengwei_Wang on 6/24/21.
 * v1 1:00
 */
public class Solution1137 {
    public int tribonacci(int n) {
        int[] f = new int[38];
        f[0] = 0;
        f[1] = 1;
        f[2] = 1;
        for(int i = 3; i <=n; ++i) {
            f[i] = f[i-1] + f[i-2] + f[i-3];
        }
        return f[n];
    }
}
