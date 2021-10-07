package easy;

/**
 * Created by Shengwei_Wang on 6/16/21.
 *
 * v1: 14:00
 */
public class Solution1826 {
    public int badSensor(int[] sensor1, int[] sensor2) {
        boolean firstError = check(sensor1, sensor2);
        boolean secondError = check(sensor2, sensor1);
        if (firstError ^ secondError == false) {
            return -1;
        }
        if (firstError) {
            return 1;
        }
        return 2;
    }

    // Assuming sensor1 is having error;
    private boolean check(int[] sensor1, int[] sensor2) {
        int i = 0;
        int n = sensor1.length;
        int diffNum = 0;
        while(i < n) {
            if(sensor1[i] != sensor2[i]) {
                diffNum = sensor2[i];
                break;
            }
            ++i;
        }
        // No defect, and guaranteed won't be equal
        if (i == n || sensor1[i] == sensor1[n - 1]) {
            return false;
        }
        while (i < n - 1) {
            if(sensor1[i] != sensor2[i + 1]) {
                return false;
            }
            ++i;
        }
        return true;
    }
}
