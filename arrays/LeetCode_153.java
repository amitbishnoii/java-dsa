public class LeetCode_153 {
    public static void main(String[] args) {
        int[] arr = { 11, 13, 15, 17 };
        System.out.println(findMin(arr));
    }

    static int findMin(int[] nums) {
        int min = 0;
        int peak = peakElement(nums);

        if (peak == nums.length - 1) {
            min = nums[0];
            return min;
        }

        int temp = binaryASC(nums, 0, peak);
        int temp2 = binaryASC(nums, peak + 1, nums.length - 1);

        if (temp > temp2) {
            min = temp2;
        } else {
            min = temp;
        }

        return min;
    }

    static int peakElement(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (start == end) {
                return end;
            } else if (arr[mid] > arr[mid + 1]) {
                return mid;
            } else if (arr[start] > arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return end;
    }

    static int binaryASC(int[] array, int start, int end) {
        return array[start];
    }
}
