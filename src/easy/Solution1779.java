package easy;

/**
 * Created by Shengwei_Wang on 6/17/21.
 *
 * v1, 5:50
 */
public class Solution1779 {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int minIndex = -1;
        int minDis = Integer.MAX_VALUE;
        for (int i = 0; i < points.length; ++i) {
            if(points[i][0] == x || points[i][1] == y) {
                int curr = Math.abs(points[i][0] - x) + Math.abs(points[i][1] - y);
                if (curr < minDis) {
                    minDis = curr;
                    minIndex = i;
                }
            }
        }
        return minIndex;
    }
}
