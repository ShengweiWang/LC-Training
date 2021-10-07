package easy;

/**
 * Created by Shengwei_Wang on 6/23/21.
 * v1 15:40 details branching!!
 */
public class Solution1309 {
    public String freqAlphabets(String s) {
        String[] splits = s.split("#");
        StringBuilder sb = new StringBuilder();
        for(int j = 0; j < splits.length - 1; ++j) {
            sb.append(build(splits[j] , true));
        }
        if (s.charAt(s.length() - 1) == '#') {
            sb.append(build(splits[splits.length - 1], true));
        } else {
            sb.append(build(splits[splits.length - 1], false));
        }
        return sb.toString();
    }

    private String build(String s, boolean endingWithTag) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length() - 2; ++i) {
            sb.append((char) (s.charAt(i) - '0' + 'a' - 1));
        }
        if (endingWithTag) {
            sb.append((char) ((s.charAt(s.length() - 2) - '0') * 10 + s.charAt(s.length() - 1) - '0' + 'a' - 1));
        } else {
            if (s.length() >= 2) {
                sb.append((char) (s.charAt(s.length() - 2) - '0' + 'a' - 1));
            }
            sb.append((char) (s.charAt(s.length() - 1) - '0' + 'a' - 1));
        }
        return sb.toString();
    }
}
