package easy;

/**
 * Created by Shengwei_Wang on 6/22/21.
 * v1 2:00
 */
public class Solution1426 {
    public int countElements(int[] arr) {
        int[] bucket = new int[1002];
        for (int num : arr) {
            bucket[num] ++;
        }
        int count = 0;
        for (int num : arr) {
            if (bucket[num + 1] != 0) {
                ++count;
            }
        }
        return count;
    }
}
