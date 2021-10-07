package easy;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Shengwei_Wang on 6/21/21.
 *
 * v1 5:09
 */
public class Solution1496 {
    public boolean isPathCrossing(String path) {
        int x = 0;
        int y = 0;
        Set<String> visited = new HashSet<>();
        visited.add("0_0");
        for(int i = 0; i < path.length(); ++i) {
            switch (path.charAt(i)) {
                case 'N': ++x; break;
                case 'S': --x; break;
                case 'E': ++y; break;
                case 'W': --y; break;
            }
            String location = x + "_" + y;
            if (visited.contains(location)) {
                return true;
            } else {
                visited.add(location);
            }
        }
        return false;
    }
}
