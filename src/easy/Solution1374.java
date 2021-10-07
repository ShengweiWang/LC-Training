package easy;

/**
 * Created by Shengwei_Wang on 6/22/21.
 * v1 2:20
 */
public class Solution1374 {
    public String generateTheString(int n) {
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i < n; ++i) {
            sb.append('a');
        }
        if(n % 2 == 0) {
            sb.append('b');
        } else {
            sb.append('a');
        }
        return sb.toString();
    }
}
