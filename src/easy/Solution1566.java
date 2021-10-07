package easy;

/**
 * Created by Shengwei_Wang on 6/20/21.
 * v1 6:00
 */
public class Solution1566 {
    public boolean containsPattern(int[] arr, int m, int k) {
        for(int i = 0; i <= arr.length - m * k; ++i) {
            boolean flag = true;
            for(int j = 1; j < k; ++j) {
                for(int mi = 0; mi < m; ++mi) {
                    if (arr[i + mi] != arr[i + mi + j * m]) {
                        flag = false;
                        break;
                    }
                }
                if (!flag) {
                    break;
                }
            }
            if (flag) {
                return true;
            }
        }
        return false;
    }
}
