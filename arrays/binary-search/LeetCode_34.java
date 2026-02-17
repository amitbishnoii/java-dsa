import java.util.Arrays;

public class LeetCode_34 {
    public static void main(String[] args) {
        int[] nums = { 5, 7, 7, 8, 8, 10 };
        int target = 6;
        System.out.println(Arrays.toString(searchRange(nums, target)));
    }

    static int[] searchRange(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int[] ind = { -1, -1 };
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target >= nums[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        ind[1] = end;
        start = 0;
        end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target <= nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        ind[0] = start;
        return ind;
    }
}
