package easy;

/**
 * Created by Shengwei_Wang on 6/23/21.
 * v1 6:44 multiple wrongs
 */
public class Solution1228 {
    public int missingNumber(int[] arr) {
        int diff = (arr[arr.length - 1] - arr[0]) / (arr.length);
        if (diff == 0) {
            return arr[0];
        }
        for(int i = 1; i < arr.length - 1; ++i) {
            if (arr[i] != arr[i-1] + diff) {
                return arr[i - 1] + diff;
            }
        }
        return arr[arr.length - 2] + diff;
    }
}
