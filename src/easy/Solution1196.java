package easy;

/**
 * Created by Shengwei_Wang on 6/24/21.
 *
 * v1 16 :10 over complicated
 */
public class Solution1196 {
    public int maxNumberOfApples(int[] arr) {
        // f (i) = until now, if we want to have X num of apples, what's the minimal weight
        // i = k -> 0 f(i + 1) = Math.min(f(i + 1), f(i) + arr[k]);
        int[] f = new int[arr.length + 1];
        for(int k = 0; k < arr.length; ++k) {
            f[k+1] = f[k] + arr[k];
            for(int i = k; i > 0; --i) {
                f[i] = Math.min(f[i], f[i - 1] + arr[k]);
            }
        }
        for(int i = 0; i <= arr.length; ++i) {
            if (f[i] > 5000) {
                return i - 1;
            }
        }
        return arr.length;
    }
}
