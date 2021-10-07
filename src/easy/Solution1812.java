package easy;

/**
 * Created by Shengwei_Wang on 6/16/21.
 *
 * v1 1:30
 */
public class Solution1812 {
    public boolean squareIsWhite(String coordinates) {
        int check = coordinates.charAt(0) - 'a' + coordinates.charAt(1) - '1';
        return check % 2 != 0;
    }
}
