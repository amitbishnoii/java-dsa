import java.util.Arrays;

public class TripletsSum {
    public static void main(String[] args) {
        long[] arr = {5, 1, 3, 4, 7};
        int sum = 12;
        int n = arr.length;
        System.out.println(countTriplets(n, sum, arr));
    }

    static long countTriplets(int n, int sum, long arr[]) {
        Arrays.sort(arr);
        long count = 0;
        for (int index = 0; index < arr.length - 2; index++) {
            int i = index + 1;
            int j = arr.length - 1;
            while (i < j && index < i) {
                long current_sum = arr[i] + arr[j] + arr[index];
                if (current_sum < sum) {
                    count = count + (j - i);
                    i++;
                } else {
                    j--;
                }
            }
        }

        return count;
    }
}
