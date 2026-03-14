public class LeetCode_485 {
    public static void main(String[] args) {
        int[] nums = { 1, 1, 0, 1, 1, 1, 1 };
        System.out.println(findMaxConsecutiveOnes(nums));
    }

    static int findMaxConsecutiveOnes(int[] nums) {
        int low = 0;
        int result = 0;
        for (int high = 0; high < nums.length; high++) {
            if (nums[high] == 0) {
                low = high + 1;
            } else {
                int len = (high - low) + 1;
                result = Math.max(result, len);
            }
        }
        return result;
    }
}