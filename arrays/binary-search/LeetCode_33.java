public class LeetCode_33 {
    public static void main(String[] args) {
        int[] arr = { 5, 1, 3 };
        int target = 5;
        System.out.println(search(arr, target));
    }

    static int search(int[] array, int target) {
        int peak = peakElement(array);
        System.out.println(peak);
        if (array[peak] == target) {
            return peak;
        }
        int ind = binaryASC(array, target, 0, peak);
        if (ind != -1) {
            return ind;
        }
        ind = binaryASC(array, target, peak + 1, array.length - 1);
        return ind;
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

    static int binaryASC(int[] array, int target, int start, int end) {

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (array[mid] < target) {
                start = mid + 1;
            } else if (array[mid] > target) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
