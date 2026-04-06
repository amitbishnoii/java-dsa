public class LeetCode_234 {
    public boolean isPalindrome(ListNode head) {

        // space = O(n) time = linear
        // Stack<Integer> st = new Stack<>();

        // ListNode temp = head;

        // while (temp != null) {
        //     st.push(temp.val);
        //     temp = temp.next;
        // }

        // ListNode temp1 = head;

        // while(temp1 != null) {
        //     if(temp1.val != st.pop()) {
        //         return false;
        //     }
        //     temp1 = temp1.next;
        // }
        // return true;

        // constant space & linear time
        ListNode slow = head;
        ListNode fast = head;
        ListNode temp = head;
        ListNode prev = null;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // reverse the linkedlist from the middle
        while (slow != null) {
            ListNode next_node = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next_node;
        }

        // compare
        while (prev != null) {
            if (prev.val != temp.val) {
                return false;
            }
            prev = prev.next;
            temp = temp.next;
        }

        return true;
    }
}
