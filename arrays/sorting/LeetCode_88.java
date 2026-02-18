import java.util.Arrays;

public class LeetCode_88 {
    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 3, 0, 0, 0 };
        int m = 3;
        int[] nums2 = { 2, 5, 6 };
        int n = 3;
        merge(nums1, m, nums2, n);
    }

    static void merge(int[] nums1, int m, int[] nums2, int n) {
        int j = 0;
        for (int i = m; i < nums1.length; i++) {
            nums1[i] = nums2[j];
            j+=1;
        }
        selection_sort(nums1);
        System.out.println(Arrays.toString(nums1));
    }

    static int[] selection_sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int largest_index = greatest_index(arr, 0, last);
            int temp = arr[largest_index];
            arr[largest_index] = arr[last];
            arr[last] = temp;
        }
        return arr;
    }

    static int greatest_index(int[] arr, int start, int end) {
        int greatest = start;
        for (int j = start; j <= end; j++) {
            if (arr[j] > arr[greatest]) {
                greatest = j;
            }
        }
        return greatest;
    }
}
