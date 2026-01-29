import java.util.Arrays;

public class LeetCode_1365 {
    public static void main(String[] args) {
        int[] nums = { 8, 1, 2, 2, 3 };
        highest_array(nums);
    }
    
    static void highest_array(int[] nums) {
        int[] out = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            int highest = nums[i];
            for (int j = 0; j < nums.length; j++) {
                if (highest > nums[j]) {
                    count += 1;
                }
            }
            out[i] = count;
        }
        System.out.println(Arrays.toString(out));
    }
}
