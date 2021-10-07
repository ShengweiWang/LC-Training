package easy;

/**
 * Created by Shengwei_Wang on 6/25/21.
 *
 * v1 3:20
 */
public class Solution1903 {
    public String largestOddNumber(String num) {
        for(int i = num.length() - 1; i >=0; --i) {
            if((num.charAt(i) - '0') % 2 == 1){
                return num.substring(0, i + 1);
            }
        }
        return "";
    }
}
