public class LeetCode_643 {
    public static void main(String[] args) {
        int[] nums = {-1};
        int k = 1;
        System.out.println(findMaxAverage(nums, k));
    }

    static double findMaxAverage(int[] nums, int k) {
        double average = Integer.MIN_VALUE;
        int low = 0;
        double sum = 0;
        int high = k - 1;

        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        while (high < nums.length) {
            // calculate average
            average = Math.max(average, sum / k);

            // slide the window
            low++;
            high++;

            // re-calculate the sum
            sum -= nums[low - 1];
            if (high == nums.length)
                break;
            sum += nums[high];
        }

        return average;
    }
}
