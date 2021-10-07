package easy;

/**
 * Created by Shengwei_Wang on 6/22/21.
 * v1 1:25
 */
public class Solution1342 {
    public int numberOfSteps(int num) {
        int count = 0;
        while (num != 0) {
            if ((num & 1) == 1) {
                --num;
            } else {
                num >>= 1;
            }
            ++count;
        }
        return count;
    }
}
