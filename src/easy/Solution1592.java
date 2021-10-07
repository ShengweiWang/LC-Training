package easy;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Shengwei_Wang on 6/20/21.
 *
 * v1 15:00
 */
public class Solution1592 {
    public String reorderSpaces(String text) {
        List<String> words = new LinkedList<>();
        int spaces = 0;
        StringBuilder sb = null;
        for(int i = 0; i < text.length(); ++i) {
            if(text.charAt(i) == ' ') {
                spaces++;
                if (sb != null) {
                    words.add(sb.toString());
                    sb = null;
                }
            } else {
                if (sb == null) {
                    sb = new StringBuilder();
                }
                sb.append(text.charAt(i));
            }
        }
        if (sb != null) {
            words.add(sb.toString());
        }
        StringBuilder result = new StringBuilder();
        result.append(words.get(0));
        if (words.size() == 1) {
            for (int i = 0; i < spaces; ++i) {
                result.append(' ');
            }
            return result.toString();
        }

        sb = new StringBuilder();
        for (int i = 0; i < spaces / (words.size() - 1); ++i) {
            sb.append(' ');
        }
        String space = sb.toString();

        for(int i = 1; i < words.size(); ++i) {
            result.append(space).append(words.get(i));
        }
        for(int i = 0; i < spaces % (words.size() - 1); ++i) {
            result.append(' ');
        }
        return result.toString();
    }
}
