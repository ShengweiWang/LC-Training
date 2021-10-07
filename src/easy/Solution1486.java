package easy;

/**
 * Created by Shengwei_Wang on 6/21/21.
 *
 * v1 6:45
 */
public class Solution1486 {

    public int xorOperation(int n, int start) {
        int result = 0;
        for (int i = 0; i <n; ++i) {
            result ^= (start + 2 * i);
        }
        return result;
    }
}
