public class LeetCode_69 {
    public static void main(String[] args) {
        System.out.println(mySqrt(8));
    }

    static int mySqrt(int x) {
        int start = 0;
        int end = x;
        int ans = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (x == 0 || x == 1) {
                return x;
            }
            if (mid > x / mid) {
                end = mid - 1;
                ans = mid;
            } else if (mid < x / mid) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return ans - 1;
    }
}
