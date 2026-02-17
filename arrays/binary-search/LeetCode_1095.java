public class LeetCode_1095 {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 4, 2, 1 };
        int target = 3;
        int peak = peakElement(arr);
        int ind = binaryASC(arr, target, peak);
        if (ind == -1) {
            ind = binaryDES(arr, target, peak);
        }
        System.out.println(ind);
    }

    static int peakElement(int[] arr) {
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

    static int binaryASC(int[] array, int x, int peak) {
        int start = 0;
        int end = peak;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (array[mid] < x) {
                start = mid + 1;
            } else if (array[mid] > x) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    static int binaryDES(int[] array, int x, int peak) {
        int start = peak + 1;
        int end = array.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (array[mid] < x) {
                end = mid - 1;
            } else if (array[mid] > x) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
