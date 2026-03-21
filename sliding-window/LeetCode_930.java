public class LeetCode_930 {
    public static void main(String[] args) {
        int[] nums = { 0, 0, 0, 0, 0 };
        int goal = 0;
        System.out.println(numSubarraysWithSum(nums, goal));
    }

    static int numSubarraysWithSum(int[] nums, int goal) {
        if (goal == 0) {
            return countSub(nums, goal);
        }
        return countSub(nums, goal) - countSub(nums, goal - 1);
    }

    static int countSub(int[] arr, int goal) {
        int result = 0;
        int low = 0;
        int currentSum = 0;

        for (int high = 0; high < arr.length; high++) {

            currentSum += arr[high];

            while (currentSum > goal) {
                currentSum -= arr[low];
                low++;
            }
            result += (high - low) + 1;
        }
        return result;
    }
}
