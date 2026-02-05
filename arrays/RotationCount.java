public class RotationCount {
    public static void main(String[] args) {
        int[] arr = { 15, 18, 2, 3, 6, 12 };
        System.out.println(peakElement(arr) + 1);
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

}
