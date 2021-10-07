package easy;

/**
 * Created by Shengwei_Wang on 6/20/21.
 *
 * v1 4:40, first time edge wrong
 */
public class Solution1720 {
    public int[] decode(int[] encoded, int first) {
        int[] result = new int[encoded.length + 1];
        result[0] = first;
        for (int i = 1; i < encoded.length + 1; ++i) {
            result[i] = encoded[i - 1] ^ result[i - 1];
        }
        return result;
    }
}
