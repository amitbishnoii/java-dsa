import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] arr = { 3, 4, 1, 2, 5 };
        // System.out.println(Arrays.toString(bubble_sort(arr)));
        // System.out.println(Arrays.toString(selection_sort(arr)));
        System.out.println(Arrays.toString(insertion_sort(arr)));
    }

    static int[] bubble_sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
        return arr;
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

    static int[] insertion_sort(int[] arr) {
        for (int i = 0; i <= arr.length - 2; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                } else if (arr[j] > arr[j-1]) {
                    break;
                }
            }
        }
        return arr;
    }
}
