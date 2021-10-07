package easy;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Shengwei_Wang on 6/21/21.
 *
 * v1 3:00
 */
public class Solution1436 {
    public String destCity(List<List<String>> paths) {
        Set<String> nonDest = new HashSet<>();
        for(List<String> path : paths) {
            nonDest.add(path.get(0));
        }
        for(List<String> path: paths) {
            if(!nonDest.contains(path.get(1))) {
                return path.get(1);
            }
        }
        return null;
    }
}
