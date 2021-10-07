package easy;

/**
 * Created by Shengwei_Wang on 6/20/21.
 *
 * v1 5:45
 */
public class Solution1629 {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        char key = keysPressed.charAt(0);
        int max_duration = releaseTimes[0];
        for (int i = 1; i < releaseTimes.length; ++i) {
            int curr = releaseTimes[i] - releaseTimes[i - 1];
            if (curr > max_duration || (curr == max_duration && keysPressed.charAt(i) > key)) {
                key = keysPressed.charAt(i);
                max_duration = curr;
            }
        }
        return key;
    }
}
