package easy;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Shengwei_Wang on 6/22/21.
 * v1 2:46
 */
public class Solution1346 {
    public boolean checkIfExist(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for(int a : arr) {
            if(set.contains(a*2)) {
                return true;
            } else if (a % 2 == 0 && set.contains(a/2)) {
                return true;
            }
            set.add(a);
        }
        return false;
    }
}
