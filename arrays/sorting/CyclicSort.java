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
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

        return arr;
    }
}
