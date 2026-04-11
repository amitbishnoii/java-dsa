public class LeetCode_1721 {
    public ListNode swapNodes(ListNode head, int k) {
        // calculate length
        ListNode temp = head;
        int length = 0;

        while (temp != null) {
            length ++;
            temp = temp.next;
        }

        ListNode first = head;
        ListNode last = head;

        // move first pointer to the target node
        for (int i = 1; i < k; i++) {
            first = first.next;
        }
        // move last pointer to the last target node
        for (int i = 0; i < length - k; i++) {
            last = last.next;
        }

        int temp1 = first.val;
        first.val = last.val;
        last.val = temp1;

        return head;
    }
}
