package easy;

/**
 * Created by Shengwei_Wang on 6/23/21.
 * v1 4:10
 */
public class Solution1323 {
    public int maximum69Number (int num) {
        int[] digits = new int[7];
        int curr = 0;
        while(num != 0) {
            digits[curr++] = num % 10;
            num /= 10;
        }
        int result = 0;
        boolean flag = true;
        for(int i = curr - 1; i >= 0; --i) {
            if (flag && digits[i] == 6) {
                digits[i] = 9;
                flag = false;
            }
            result = result * 10 + digits[i];
        }
        return result;
    }
}
