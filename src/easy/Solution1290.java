package easy;

/**
 * Created by Shengwei_Wang on 6/23/21.
 * v1 1:00
 */
public class Solution1290 {
    public int getDecimalValue(ListNode head) {
        int curr = 0;
        while(head != null) {
            curr = curr * 2 + head.val;
            head = head.next;
        }
        return curr;
    }
}
