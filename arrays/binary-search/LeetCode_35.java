public class LeetCode_35 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 5, 8, 9, 12, 15 };
        int target = 11;
        System.out.println(binary(arr, target));
    }

    static int binary(int[] array, int target) {
        int start = 0;
        int end = array.length - 1;
        int ind = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (array[mid] < target) {
                start = mid + 1;
            } else if (array[mid] > target) {
                end = mid - 1;
            } else {
                return mid;
            }
            ind = end + 1;
        }

        return ind;
    }
}
