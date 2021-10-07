package easy;

/**
 * Created by Shengwei_Wang on 6/20/21.
 * v1 10:00, detail in string indexing
 */
public class Solution1668 {
    public int maxRepeating(String sequence, String word) {
        int max = 0;
        boolean[] tested = new boolean[sequence.length() + 1];
        for (int i = 0; i <= sequence.length() - word.length(); ++i) {
            if (!tested[i]) {
                tested[i] = true;
                int currCount = 0;
                int index = i;
                while(check(sequence, index, word)) {
                    index += word.length();
                    tested[index] = true;
                    currCount++;
                }
                tested[index] = true;
                max = Math.max(max, currCount);
            }
        }
        return max;
    }

    private boolean check(String sequence, int index, String word) {
        if (index + word.length() > sequence.length()) {
            return false;
        }
        for (int i = 0; i < word.length(); ++i) {
            if (sequence.charAt(index + i) != word.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
