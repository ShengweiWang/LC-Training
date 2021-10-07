package easy;

/**
 * Created by Shengwei_Wang on 6/22/21.
 *
 * v1 7:20
 */
public class Solution1417 {
    public String reformat(String s) {
        StringBuilder sbnum = new StringBuilder();
        StringBuilder sbword = new StringBuilder();
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                sbnum.append(s.charAt(i));
            } else {
                sbword.append(s.charAt(i));
            }
        }
        if (Math.abs(sbnum.length() - sbword.length()) > 1) {
            return "";
        } else {
            return sbnum.length() > sbword.length()? build(sbnum.toString(), sbword.toString()) : build(sbword.toString(), sbnum.toString()) ;
        }
    }
    private String build(String s1, String s2) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s2.length(); ++i){
            sb.append(s1.charAt(i)).append(s2.charAt(i));
        }
        if (s1.length() > s2.length()) {
            sb.append(s1.charAt(s1.length() - 1));
        }
        return sb.toString();
    }
}
