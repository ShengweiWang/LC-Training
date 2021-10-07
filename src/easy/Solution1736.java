package easy;

/**
 * Created by Shengwei_Wang on 6/20/21.
 *
 * v1, 7:00
 */
public class Solution1736 {
    public String maximumTime(String time) {
        char[] digits = time.toCharArray();
        if (digits[0] == '?') {
            if (digits[1] == '?' || digits[1] <= '3') {
                digits[0] = '2';
            } else {
                digits[0] = '1';
            }
        }
        if (digits[1] == '?') {
            if (digits[0] == '2') {
                digits[1] = '3';
            } else {
                digits[1] = '9';
            }
        }
        if (digits[3] == '?') {
            digits[3] = '5';
        }
        if (digits[4] == '?'){
            digits[4] = '9';
        }
        return new String(digits);
    }
}
