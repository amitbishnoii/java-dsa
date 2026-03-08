import java.util.Arrays;

public class LeetCode_2563 {
    public static void main(String[] args) {
        int[] nums = { 0, 1, 7, 4, 4, 5 };
        // 0, 1, 4, 4, 5, 7
        // 0, 1, 7, 4, 4, 5
        // (0,3), (0,4), (0,5), (1,3), (1,4), and (1,5).
        int lower = 3;
        int upper = 6;
        System.out.println(countPairs(nums, upper) - countPairs(nums, lower - 1));
    }

    static long countPairs(int[] nums, int target) {
        Arrays.sort(nums);
        long count = (long) 0;
        int i = 0;
        int j = nums.length - 1;

        while (i < j) {
            if (nums[i] + nums[j] <= target) {
                count += (j - i);
                i++;
            } else {
                j--;
            }
        }
        return count;
    }
}
