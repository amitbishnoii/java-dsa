public class LeetCode_1493 {
    public static void main(String[] args) {
        int[] nums = { 1,1,0,1 };
        System.out.println(longestSubarray(nums));
    }

    static int longestSubarray(int[] nums) {
        int result = 0;
        int zeroCount = 0;
        int low = 0;

        for (int high = 0; high < nums.length; high++) {
            if (nums[high] == 0) {
                zeroCount += 1;
            }
            while (zeroCount > 1) {
                if (nums[low] == 0) {
                    zeroCount -= 1;
                }
                low++;
            }
            int len = (high - low) + 1;
            result = Math.max(len, result);
        }
        return result - 1;
    }
}
