package easy;

/**
 * Created by Shengwei_Wang on 6/23/21.
 * v1 6:00
 */
public class Solution1243 {
    public List<Integer> transformArray(int[] arr) {
        boolean changed = true;
        while(changed) {
            changed = false;
            int prev = arr[0];
            for(int i = 1; i < arr.length - 1; ++i) {
                int temp = arr[i];
                if (arr[i] > prev && arr[i] > arr[i + 1]) {
                    changed = true;
                    arr[i]--;
                }
                if (arr[i] < prev && arr[i] < arr[i + 1]) {
                    changed = true;
                    arr[i]++;
                }
                prev = temp;
            }
        }
        List<Integer> result = new LinkedList<>();
        for(int num : arr) {
            result.add(num);
        }
        return result;
    }
}
