public class LeetCode_153 {
    public static void main(String[] args) {
        int[] arr = { 17, 10, 11, 13, 15 };
        System.out.println(findMin(arr));
    }

    static int findMin(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] <= nums[end]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return nums[start];
    }
}
