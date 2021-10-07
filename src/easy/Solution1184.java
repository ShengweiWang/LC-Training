package easy;

/**
 * Created by Shengwei_Wang on 6/24/21.
 * v1 3:20
 */
public class Solution1184 {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int sum = 0;
        int clockwise = 0;
        if (start > destination) {
            int temp = start;
            start = destination;
            destination = temp;
        }
        for(int i = 0; i < distance.length; ++i) {
            sum += distance[i];
            if(i >= start && i < destination) {
                clockwise += distance[i];
            }
        }
        return Math.min(clockwise, sum - clockwise);
    }
}
