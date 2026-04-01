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
}
