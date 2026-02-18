import java.util.Arrays;

public class LeetCode_169 {
    public static void main(String[] args) {
        int[] arr = { 2, 2 };
        System.out.println(majorityElement(arr));
    }

    static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                count += 1;
            } else {
                count = 1;
            }
            if (count > nums.length / 2) {
                return nums[i];
            }
        }
        return nums[0];
    }
}
