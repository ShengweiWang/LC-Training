package easy;

/**
 * Created by Shengwei_Wang on 6/20/21.
 *
 * v1 18:00, try to find the right way before unify code
 */
public class Solution1652 {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] result = new int[n];
        if (k == 0) {
            for (int i = 0; i < n; ++i) {
                result[i] = 0;
            }
        } else if (k > 0) {
            int base = 0;
            for (int i = 0; i < k; ++i) {
                base += code[i];
            }
            for (int i = 0; i < n; ++i) {
                base = base - code[i] + code[(i + k) % n];
                result[i] = base;
            }
        } else if (k < 0) {
            k = -k;
            int base = 0;
            for (int i = 1; i <= k; ++i) {
                base += code[n - i];
            }
            for (int i = 0; i < n; ++i) {
                result[i] = base;
                base = base + code[i] - code[(i - k + n) % n];
            }
        }
        return result;
    }
}
