import java.util.Arrays;

public class LeetCode_16 {
    public static void main(String[] args) {
        int[] nums = { -1, 2, 1, -4 };
        int target = 1;
        System.out.println(threeSumClosest(nums, target));
    }

    static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int difference = Integer.MAX_VALUE;
        int result = 0;
        for (int index = 0; index < nums.length - 2; index++) {
            int i = index + 1;
            int j = nums.length - 1;
            while (i < j) {
                int sum = nums[i] + nums[j] + nums[index];
                int current_diff = Math.abs(target - sum);
                if (sum == target) {
                    return nums[i] + nums[j] + nums[index];
                } else if (sum > target) {
                    if (difference > current_diff) {
                        difference = current_diff;
                        result = sum;
                    }
                    j--;
                } else {
                    if (difference > current_diff) {
                        difference = current_diff;
                        result = sum;
                    }
                    i++;
                }
            }
        }
        return result;
    }
}
