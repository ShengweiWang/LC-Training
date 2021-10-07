package easy;

/**
 * Created by Shengwei_Wang on 6/24/21.
 *
 * v1 4:30
 */
public class Solution1176 {
    public int dietPlanPerformance(int[] calories, int k, int lower, int upper) {
        int t = 0;
        for(int i = 0; i < k; ++i) {
            t += calories[i];
        }
        int point = check(t, lower, upper);
        for(int i = k; i < calories.length; ++i) {
            t = t - calories[i - k] + calories[i];
            point += check(t, lower, upper);
        }
        return point;
    }
    private int check(int t, int lower, int upper) {
        if (t < lower) {
            return -1;
        } else if (t > upper) {
            return 1;
        } else {
            return 0;
        }
    }
}
