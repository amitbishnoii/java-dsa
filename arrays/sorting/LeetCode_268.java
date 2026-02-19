public class LeetCode_268 {
    // solved using cyclic sort approach
    public static void main(String[] args) {
        int[] arr = { 4, 3, 2, 0 };
        System.out.println(missing(arr));
    }

    static int missing(int[] arr) {
        cycle_sort(arr);
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j) {
                return j;
            }
        }
        return arr.length;
    }

    static void swap(int[] arr, int ind1, int ind2) {
        int temp = arr[ind1];
        arr[ind1] = arr[ind2];
        arr[ind2] = temp;
    }

    static int[] cycle_sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i];
            if (arr[i] == arr.length) {
                i++;
            } else if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        return arr;
    }
}
