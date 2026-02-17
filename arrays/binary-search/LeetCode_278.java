public class LeetCode_278 {
    public static void main(String[] args) {
        
    }

    static int firstBadVersion(int n) {
        int ind = -1;
        int start = 1;
        int end = n;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (isBadVersion(mid)) {
                ind = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return ind;
    }

    static boolean isBadVersion(int n) {
        // this is just a fake function real api is defined in the LeetCode_278 question.
        return true;
    }
}
