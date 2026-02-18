import java.util.Arrays;

public class LeetCode_217 {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 12, 34, 5, 6, 4, 3 };
        System.out.println(containsDuplicate(arr));
    }

    static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) { 
            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }
        return false;
    }
}
