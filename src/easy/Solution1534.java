package easy;

/**
 * Created by Shengwei_Wang on 6/21/21.
 *
 * v1 6:13
 */
public class Solution1534 {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int count = 0;
        for(int i = 0; i < arr.length - 2; ++i) {
            for (int j = i + 1; j < arr.length - 1; ++j) {
                for (int k = j + 1; k < arr.length; ++k) {
                    if (check(arr[i], arr[j], arr[k], a, b, c)) {
                        ++count;
                    }
                }
            }
        }
        return count;
    }

    private boolean check(int a1, int a2, int a3, int a, int b, int c) {
        return (Math.abs(a1 - a2) <= a && Math.abs(a2 - a3) <= b && Math.abs(a1 - a3) <= c);
    }
}
