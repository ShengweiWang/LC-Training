package easy;

/**
 * Created by Shengwei_Wang on 6/23/21.
 * v1 7:15
 */
public class Solution1232 {
    public boolean checkStraightLine(int[][] coordinates) {
        // Check if parallel to y;
        if (coordinates[0][0] == coordinates[1][0]) {
            for (int i = 2; i < coordinates.length; ++i) {
                if (coordinates[i][0] != coordinates[0][0]) {
                    return false;
                }
            }
            return true;
        }

        // if not parallel to y

        double k = calculateK(coordinates[0][0], coordinates[0][1], coordinates[1][0], coordinates[1][1]);
        double diff = 0.0001;
        for (int i = 2; i < coordinates.length; ++i) {
            if (Math.abs((calculateK(coordinates[0][0], coordinates[0][1], coordinates[i][0], coordinates[i][1]) - k)) > diff) {
                return false;
            }
        }
        return true;

    }

    private double calculateK(int x1, int y1, int x2, int y2) {
        return (double) (y2 - y1) / (double) (x2 - x1);
    }
}
