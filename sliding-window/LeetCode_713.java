public class LeetCode_713 {
    public static void main(String[] args) {
        int[] nums = { 10, 5, 2, 6 };
        int k = 100;
        System.out.println(numSubarrayProductLessThanK(nums, k));
    }

    static int numSubarrayProductLessThanK(int[] nums, int k) {
        int count = 0;
        int low = 0;
        int prod = 1;

        if (k == 0) return 0;

        for (int high = 0; high < nums.length; high++) {
            prod *= nums[high];
            while (prod >= k && low <= high) {
                prod = prod / nums[low];
                low++;
            }
            count += (high - low) + 1;
        }

        return count;
    }
}
