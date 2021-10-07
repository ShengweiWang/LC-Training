package easy;

/**
 * Created by Shengwei_Wang on 6/20/21.
 *
 * v1, 3:00
 */
public class Solution1725 {
    public int countGoodRectangles(int[][] rectangles) {
        int count = 0;
        int maxLen = 0;
        for (int[] rectangle: rectangles) {
            if (rectangle[0] >= maxLen && rectangle[1] >= maxLen) {
                if (rectangle[0] == maxLen || rectangle[1] == maxLen) {
                    count++;
                } else {
                    count = 1;
                    maxLen = Math.min(rectangle[0], rectangle[1]);
                }
            }
        }
        return count;

    }
}
