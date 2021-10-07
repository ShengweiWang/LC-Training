package easy;

/**
 * Created by Shengwei_Wang on 6/20/21.
 *
 * v1 2:30
 */
public class Solution1678 {
    public String interpret(String command) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < command.length(); ++i) {
            if (command.charAt(i) == 'G') {
                sb.append('G');
            } else if (command.charAt(i) == ')') {
                if (command.charAt(i - 1) == 'l') {
                    sb.append("al");
                } else {
                    sb.append('o');
                }
            }
        }
        return sb.toString();
    }
}
