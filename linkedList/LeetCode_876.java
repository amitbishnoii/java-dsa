public class LeetCode_876 {
    public ListNode middleNode(ListNode head) {
        int len = 0;
        ListNode temp = head;

        while (temp != null) {
            temp = temp.next;
            len += 1;
        }

        len = len / 2;

        ListNode mid = head;

        for (int i = 0; i < len; i++) {
            mid = mid.next;
        }

        return mid;
    }

    public ListNode middleNodeOp(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}
