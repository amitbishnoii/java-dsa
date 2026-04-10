public class LeetCode_92 {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head.next == null)
            return head;

        ListNode first = head;
        ListNode second = head;
        ListNode prev = null;

        for (int i = 0; i < left - 1; i++) {
            prev = first;
            first = first.next;
        }

        for (int i = 0; i < right - 1; i++) {
            second = second.next;
        }

        ListNode last = second.next;
        ListNode temp = last;

        while (first != last) {
            ListNode nextNode = first.next;
            first.next = temp;
            temp = first;
            first = nextNode;
        }

        // reconnect
        if (prev != null) {
            prev.next = temp;
        } else {
            head = temp;
        }

        return head;
    }
}
