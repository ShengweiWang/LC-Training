package easy;

import java.util.Arrays;

/**
 * Created by Shengwei_Wang on 6/15/21.
 * v1.5
 */
public class Solution1859 {
    public String sortSentence(String s) {
        String[] splits = s.split(" ");
        String[] refinedStrings = arraysSort(splits);
        return construct(refinedStrings);
    }

    private String[] bucketSort(String[] rowStrings) {
        String[] refinedStrings = new String[rowStrings.length];
        for(String rowString : rowStrings) {
            refinedStrings[rowString.charAt(rowString.length() - 1) - '1'] = rowString.substring(0, rowString.length() - 1);
        }
        return refinedStrings;
    }

    private String construct(String[] strings) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strings.length - 1; ++i) {
            sb.append(strings[i]).append(" ");
        }
        sb.append(strings[strings.length - 1]);
        return sb.toString();
    }

    private String[] arraysSort(String[] rowStrings) {
        Arrays.sort(rowStrings, (a, b) -> a.charAt(a.length() - 1) - b.charAt(b.length() - 1));
        String[] refinedStrings = new String[rowStrings.length];
        for (int i = 0; i < rowStrings.length; ++i) {
            refinedStrings[i] = rowStrings[i].substring(0, rowStrings[i].length() - 1);
        }
        return refinedStrings;
    }
}
