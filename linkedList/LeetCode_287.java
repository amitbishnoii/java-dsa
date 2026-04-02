public class LeetCode_287 {
    public int findDuplicate(int[] arr) {
        int slow = 0;
        int fast = 0;

        while (true) {
            slow = arr[slow];
            fast = arr[fast];
            fast = arr[fast];

            if (fast == slow) {
                slow = 0;

                while (fast != slow) {
                    slow = arr[slow];
                    fast = arr[fast];
                }
                return slow;
            }
        }
    }
}