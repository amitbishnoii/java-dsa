public class LeetCode_852 {
    public static void main(String[] args) {
        // int[] arr = { 24, 69, 100, 99, 79, 78, 67, 36, 26, 19 };
        int[] arr = { 3, 5, 3, 2, 0 };
        System.out.println(peakIndexInMountainArray(arr));

    }

    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (start == end) {
                return start;
            } else if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return end;
    }
}
