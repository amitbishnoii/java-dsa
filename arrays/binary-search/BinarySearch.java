public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int x = 8;
        System.out.println(binary(arr, x));
    }

    static int binary(int[] array, int x) {
        int start = 0;
        int end = array.length - 1;

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
}
