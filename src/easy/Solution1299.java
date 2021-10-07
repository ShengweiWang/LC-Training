package easy;

/**
 * Created by Shengwei_Wang on 6/23/21.
 * v1 2:30
 */
public class Solution1299 {
    public int[] replaceElements(int[] arr) {
        int max = -1;
        for (int i = arr.length - 1; i >= 0; --i){
            if (arr[i] > max) {
                int temp = max;
                max = arr[i];
                arr[i] = temp;
            } else {
                arr[i] = max;
            }
        }
        return arr;
    }
}
