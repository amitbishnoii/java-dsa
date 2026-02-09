public class LeetCode_154 {
    public static void main(String[] args) {
        int[] nums = { 17, 18, 9, 11, 13, 15 };
        System.out.println(findMin(nums));
    }

    static int findMin(int[] nums) {
        // int min = 0;
        // int peak = peakElement(nums);

        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            // if (start == end) {
            //     return end;
            // } else if (arr[mid] > arr[mid + 1]) {
            //     return mid;
            // } else if (arr[start] > arr[mid]) {
            //     end = mid - 1;
            // } else {
            //     start = mid + 1;
            // }
            if (nums[mid] <= nums[end]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return nums[start];
    }

    static int peakElement(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            // if (start == end) {
            //     return end;
            // } else if (arr[mid] > arr[mid + 1]) {
            //     return mid;
            // } else if (arr[start] > arr[mid]) {
            //     end = mid - 1;
            // } else {
            //     start = mid + 1;
            // }
            if (arr[mid] < arr[end]) {
                end = mid;
            } else if (arr[mid] > arr[end]) {
                start = end + 1;
            } else {
                return mid;
            }
        }
        return start;
    }

    static int binaryASC(int[] array, int start, int end) {
        return array[start];
    }
}
