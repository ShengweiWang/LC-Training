package easy;

/**
 * Created by Shengwei_Wang on 6/21/21.
 *
 * v1 2:25 details about string methods!
 */
public class Solution1455 {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] words = sentence.split(" ");
        for(int i = 0; i < words.length; ++i) {
            if (words[i].indexOf(searchWord) == 0) {
                return i + 1;
            }
        }
        return -1;
    }
}
