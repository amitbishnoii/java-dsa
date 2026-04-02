public class LeetCode_202 {
    static int sum(int n) {
        int sq = 0;

        while (n > 0) {
            int temp = n % 10;
            sq += temp * temp;
            n = n / 10;
        }

        return sq;
    }

    public boolean happy(int n) {
        int slow = n;
        int fast = n;

        while (fast != 1) {
            slow = sum(n);
            fast = sum(n);
            fast = sum(n);

            if (slow == fast && slow != 1) {
                return false;
            }
        }

        return true;
    }
}
