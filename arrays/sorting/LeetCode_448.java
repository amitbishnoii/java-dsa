import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode_448 {
    public static void main(String[] args) {
        int[] arr = { 4, 3, 2, 7, 8, 2, 3, 1 };
        // System.out.println(Arrays.toString(cycle_sort(arr)));
        System.out.println(findDisappearedNumbers(arr));
    }

    static List<Integer> findDisappearedNumbers(int[] arr) {
        List<Integer> result = new ArrayList<>();
        cycle_sort(arr);
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] - 1 != j) {
                result.add(j+1);
            }
        }
        return result;
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
