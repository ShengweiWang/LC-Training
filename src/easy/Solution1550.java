package easy;

/**
 * Created by Shengwei_Wang on 6/20/21.
 *
 * v1 2:20
 */
public class Solution1550 {
    public boolean threeConsecutiveOdds(int[] arr) {
        int i = 0;
        while (i < arr.length - 2) {
            if (arr[i] % 2 == 1) {
                if(arr[i + 1] % 2 == 1 && arr[i + 2] % 2 ==1) {
                    return true;
                }
            }
            ++i;
        }
        return false;
    }
}
