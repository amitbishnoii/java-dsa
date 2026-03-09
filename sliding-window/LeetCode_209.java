public class LeetCode_209 {
    public static void main(String[] args) {
        int[] nums = { 2, 3, 1, 2, 4, 3 };
        int target = 7;
        System.out.println(minSubArrayLen(target, nums));
    }

    static int minSubArrayLen(int target, int[] nums) {
        int result = Integer.MAX_VALUE;
        int low = 0;
        int high = 0;
        int sum = 0;

        while (high < nums.length) {
            sum += nums[high];
            while (sum >= target) {
                int len = (high - low) + 1;
                result = Math.min(result, len);
                sum -= nums[low];
                low++;
            }
            high++;
        }
        return result;
    }
}
