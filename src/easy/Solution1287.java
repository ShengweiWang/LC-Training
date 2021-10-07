package easy;

/**
 * Created by Shengwei_Wang on 6/23/21.
 * v1 2:00
 */
public class Solution1287 {
    public int findSpecialInteger(int[] arr) {
        int[] freq = new int[100001];
        int bar = arr.length / 4;
        for(int num : arr) {
            if(++freq[num] > bar) {
                return num;
            }
        }
        return -1;
    }
}
