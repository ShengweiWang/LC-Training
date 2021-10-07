package easy;

/**
 * Created by Shengwei_Wang on 6/23/21.
 * v1 2:45
 */
public class Solution1304 {
    public int[] sumZero(int n) {
        int curr = 0;
        int[] result = new int[n];
        for(int i = 0; i < n/2; ++i) {
            result[curr++] = -i - 1;
            result[curr++] = i + 1;
        }
        if (curr != n) {
            result[curr] = 0;
        }
        return result;
    }
}
