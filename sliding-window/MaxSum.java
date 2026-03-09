public class MaxSum {
    public static void main(String[] args) {
        int[] arr = { 100, 200, 300, 400 };
        int k = 2;
        System.out.println(max(arr, k));
    }

    static int max(int[] arr, int k) {
        int sum = 0;
        int result = Integer.MIN_VALUE;
        int low = 0;
        int high = k - 1;

        for (int i = low; i <= high; i++) {
            sum += arr[i];
        }

        while (high < arr.length) {
            result = Math.max(sum, result);
            low++;
            high++;
            sum -= arr[low - 1];
            if (high == arr.length) {
                break;
            }
            sum += arr[high];
        }

        return result;
    }
}
