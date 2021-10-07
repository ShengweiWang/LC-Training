package easy;

/**
 * Created by Shengwei_Wang on 6/23/21.
 * v1 3:30
 */
public class Solution1266 {
    public int minTimeToVisitAllPoints(int[][] points) {
        int curr = 0;
        for(int i = 1; i < points.length; ++i) {
            int xdiff = Math.abs(points[i][0] - points[i-1][0]);
            int ydiff = Math.abs(points[i][1] - points[i-1][1]);
            curr += Math.max(xdiff, ydiff);
        }
        return curr;
    }
}
