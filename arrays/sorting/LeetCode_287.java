public class LeetCode_287 {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 4, 2, 2 };
        System.out.println(findDuplicate(arr));
    }

    static int findDuplicate(int[] arr) {
        cycle_sort(arr);
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                return arr[j];
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
