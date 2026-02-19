import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        // System.out.println(Arrays.toString(bubble_sort(arr)));
        // System.out.println(Arrays.toString(selection_sort(arr)));
        System.out.println(Arrays.toString(insertion_sort(arr)));
    }

    static void swap(int[] arr, int ind1, int ind2) {
        int temp = arr[ind1];
        arr[ind1] = arr[ind2];
        arr[ind2] = temp;
    }

    static int[] bubble_sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                }
            }
        }
        return arr;
    }

    static int[] selection_sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int largest_index = greatest_index(arr, 0, last);
            swap(arr, largest_index, last);
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

    static int[] insertion_sort(int[] arr) {
        for (int i = 0; i <= arr.length - 2; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                } else if (arr[j] > arr[j - 1]) {
                    break;
                }
            }
        }
        return arr;
    }
}
