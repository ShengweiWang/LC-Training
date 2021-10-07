package easy;

/**
 * Created by Shengwei_Wang on 6/21/21.
 *
 * v1 1:47
 */
public class Solution1491 {
    public double average(int[] salary) {
        int min = salary[0];
        int max = salary[1];
        double sum = 0;
        for (int s : salary) {
            sum += s;
            min = Math.min(min, s);
            max = Math.max(max, s);
        }
        return (sum - min - max) / (salary.length - 2);
    }
}
