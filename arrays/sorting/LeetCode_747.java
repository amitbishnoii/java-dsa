public class LeetCode_747 {
    public static void main(String[] args) {
        int[] nums = { 0, 3, 1, 2 };
        System.out.println(dominantIndex(nums));
    }

    static int dominantIndex(int[] nums) {
        int greatest = 0;
        int greatest2 = -1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[greatest]) {
                greatest = i;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (i != greatest) {
                if (greatest2 == -1 || nums[i] > nums[greatest2]) {
                    greatest2 = i;
                }
            }
        }
        if (nums[greatest] >= (nums[greatest2] * 2)) {
            return greatest;
        }
        return -1;
    }
}
