public class LeetCode_206 {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode pointer = head;

        while (pointer != null) {
            ListNode next = pointer.next;
            pointer.next = prev;
            prev = pointer;
            pointer = next;
        }

        return prev;
    }
}