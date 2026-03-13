public class LeetCode_1004 {
    public static void main(String[] args) {
        int[] nums = { 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0 };
        int k = 2;
        System.out.println(longestOnes(nums, k));
    }

    static int longestOnes(int[] nums, int k) {
        int[] freq = new int[2];
        int low = 0;
        int result = 0;
        int zeroes = 0;
        for (int high = 0; high < nums.length; high++) {
            freq[nums[high]]++;
            if (nums[high] == 0) zeroes++;

            while (zeroes > k) {
                if(nums[low] == 0) zeroes--;
                low++;
            }

            int len = (high - low) + 1;
            result = Math.max(len, result);
        }
        // if (freq[1] == 0 && k == 0) return 0;
        return result;
    }
}
