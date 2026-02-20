import java.util.Arrays;

public class LeetCode_645 {
    public static void main(String[] args) {
        int[] nums = { 2, 2 };
        System.out.println(Arrays.toString(findErrorNums(nums)));
    }

    static int[] findErrorNums(int[] nums) {
        cycle_sort(nums);
        int[] result = new int[2];
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] - 1 != j) {
                result[0] = nums[j];
                result[1] = j + 1;
            }
        }
        return result;
    }

    static void swap(int[] arr, int ind1, int ind2) {
        int temp = arr[ind1];
        arr[ind1] = arr[ind2];
        arr[ind2] = temp;
    }

    static void cycle_sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
    }
}
