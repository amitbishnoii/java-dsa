public class LeetCode_1512 {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 1, 1, 3 };
        int pairs = 0;
        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (current == nums[j]) {
                    pairs += 1;
                }
            }
        }
        System.out.println(pairs);
    }
}
