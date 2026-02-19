import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = { 4, 3, 5, 1, 2 };
        System.out.println(Arrays.toString(cycle_sort(arr)));
    }

    static void swap(int[] arr, int ind1, int ind2) {
        int temp = arr[ind1];
        arr[ind1] = arr[ind2];
        arr[ind2] = temp;
    }

    static int[] cycle_sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                swap(arr, i, arr[i] - 1);
            }
        }

        return arr;
    }
}
