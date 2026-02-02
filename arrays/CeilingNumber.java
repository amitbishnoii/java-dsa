public class CeilingNumber {
    public static void main(String[] args) {
        int[] arr = { 12, 14, 16, 18, 20 };

        int target = 17;

        System.out.println(ceilingNumber(arr, target));

    }

    static int ceilingNumber(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int ceil = 0;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                ceil = arr[mid];
                return arr[mid];
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

            if (start > end) {
                ceil = arr[start];
                return arr[start];
            }
        }
        return ceil;
    }
}
