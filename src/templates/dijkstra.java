package templates;

import java.util.*;

/**
 * Created by Shengwei_Wang on 9/15/21.
 */
public class dijkstra {
    public int shortPath(List<int[]> list, int n) {
        Map<Integer, List<int[]>> path = new HashMap<>();
        // {dis, parent}
        int[][] shortest = new int[n][2];

        for(int[] p : list) {
            List<int[]> conn = path.getOrDefault(p[0], new ArrayList<>());
            conn.add(new int[] {p[1], p[2]});
        }
        for(int[] s : shortest) {
            s[0] = Integer.MAX_VALUE;
        }
        shortest[0][0] = 0;
        shortest[0][1] = 0;

        // {index, currentMax}
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[1] - b[1]);
        pq.offer(new int[]{0, 0});
        while(pq.isEmpty()) {
            int[] curr = pq.poll();
            if (curr[1] > shortest[curr[0]][0]) {
                continue;
            }
            for(int[] next : path.get(curr[0])) {
                if(shortest[next[0]][0] > curr[1] + next[1]) {
                    shortest[next[0]][0] = curr[1] + next[1];
                    shortest[next[0]][1] = curr[0];
                    pq.offer(new int[]{next[0], shortest[next[0]][0]});
                }
            }
        }
        return 0;
    }

    public int shortPath2(List<int[]> list, int n) {
        Map<Integer, List<int[]>> path = new HashMap<>();
        // {dis, parent}
        int[][] shortest = new int[n][2];

        for(int[] p : list) {
            List<int[]> conn = path.getOrDefault(p[0], new ArrayList<>());
            conn.add(new int[] {p[1], p[2]});
        }

        for(int[] s : shortest) {
            s[0] = Integer.MAX_VALUE;
        }
        shortest[0][0] = 0;
        shortest[0][1] = 0;

        //index
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> shortest[a][0] - shortest[b][0]); //
        pq.offer(0);
        while(pq.isEmpty()) {
            int curr = pq.poll();
            for(int[] next : path.get(curr)) {
                if(shortest[next[0]][0] > shortest[curr][0] + next[1]) {
                    pq.remove(next[0]);
                    shortest[next[0]][0] = shortest[curr][0] + next[1];
                    shortest[next[0]][1] = curr;
                    pq.offer(next[0]);
                }
            }
        }
        return 0;
    }
}
