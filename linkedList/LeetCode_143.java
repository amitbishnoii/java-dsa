public class LeetCode_143 {
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
        ListNode temp = head;
        ListNode prevSlow = null;

        while (fast != null && fast.next != null) {
            prevSlow = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        if (prevSlow != null) prevSlow.next = null;

        while (slow != null) {
            ListNode next_node = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next_node;
        }

        while (prev != null) {
            ListNode first = temp.next;
            ListNode second = prev.next;

            temp.next = prev;
            // prev.next = first;
            prev.next = (first != null) ? first : second;

            temp = first;
            prev = second;
        }
    }
}
