package easy;

/**
 * Created by Shengwei_Wang on 6/21/21.
 *
 * v1 10:00, details about edge case
 */
public class Solution1474 {
    public ListNode deleteNodes(ListNode head, int m, int n) {
        int count = m - 1;
        boolean keep = true;
        ListNode prev = head;
        while(prev != null && prev.next != null) {
            if (count == 0) {
                keep = !keep;
                if (keep) {
                    count = m;
                } else {
                    count = n;
                }
                continue;
            }
            --count;
            if (!keep) {
                prev.next = prev.next.next;
            } else {
                prev = prev.next;
            }
        }
        return head;
    }
}
