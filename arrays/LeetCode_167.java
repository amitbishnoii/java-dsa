import java.util.Arrays;

public class LeetCode_167 {
    public static void main(String[] args) {
        int[] arr = { -10, -8, -2, 1, 2, 5, 6 };
        int target = 0;
        System.out.println(Arrays.toString(twoSum(arr, target)));
    }

    static int[] twoSum(int[] nums, int target) {
        int[] ind = { 0, 0 };
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            if (nums[start] + nums[end] > target) {
                end -= 1;
            } else if (nums[start] + nums[end] < target) {
                start += 1;
            } else {
                ind[0] = start + 1;
                ind[1] = end + 1;
                return ind;
            }
        }
        return ind;
    }
}
