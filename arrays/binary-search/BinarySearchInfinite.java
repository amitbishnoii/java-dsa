public class BinarySearchInfinite {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 7, 12, 19, 23, 28, 34, 41, 47 };
        int target = 24;
        System.out.println(infiniteSearch(arr, target));
    }

    static int infiniteSearch(int[] arr, int target) {
        int start = 0;
        int end = 1;
        while (target > arr[end]) {
            int newStart = end + 1;
            end = end + (end - start + 1) * 2;
            start = newStart;
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}
