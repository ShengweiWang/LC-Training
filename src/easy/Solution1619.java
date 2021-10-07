package easy;

import java.util.PriorityQueue;

/**
 * Created by Shengwei_Wang on 6/20/21.
 *
 * v1 12:40, can be simplified
 */
public class Solution1619 {
    public double trimMean(int[] arr) {
        int n = arr.length;
        int pqSize = n / 20;
        double cal = 0;
        PriorityQueue<Integer> small = new PriorityQueue<Integer>((a,b) -> b.compareTo(a)); // smallest 5%
        PriorityQueue<Integer> large = new PriorityQueue<Integer>((a,b) -> a.compareTo(b)); // smallest 5%
        for(int num : arr) {
            if (small.size() != pqSize) {
                small.offer(num);
                continue;
            } else if (num < small.peek()) {
                small.offer(num);
                num = small.poll();
            }
            if (large.size() != pqSize) {
                large.offer(num);
                continue;
            } else if (num > large.peek()) {
                large.offer(num);
                cal += large.poll();
            } else {
                cal += num;
            }
        }
        return cal / (0.9 * n);
    }
}
