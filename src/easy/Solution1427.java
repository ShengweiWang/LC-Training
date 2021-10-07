package easy;

/**
 * Created by Shengwei_Wang on 6/22/21.
 *
 * v1 6:10
 */
public class Solution1427 {
    public String stringShift(String s, int[][] shift) {
        int overall = 0;
        for (int[] single : shift) {
            if (single[0] == 1) {
                overall -= single[1];
            } else {
                overall += single[1];
            }
        }
        String ss = s + s;
        overall = (overall % s.length() + s.length()) % s.length();
        return ss.substring(overall, overall + s.length());
    }
}
