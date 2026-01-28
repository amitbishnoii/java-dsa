public class LeetCode_1920 {
    public static void main(String[] args) {
        int[] nums = { 5, 0, 1, 2, 3, 4 };
        System.out.println(build_permutation(nums));
    }

    static int[] build_permutation(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
