public class LeetCode_41 {
    public static void main(String[] args) {
        int[] arr = { 2, 1 };
        System.out.println(firstMissingPositive(arr));
    }

    static int firstMissingPositive(int[] nums) {
        if (nums.length == 1 && nums[0] == 1) {
            return 2;
        }
        cycle_sort(nums);
        int temp = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == temp) {
                temp += 1;
            } else {
                return temp;
            }
        }
        return temp;
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
            if (arr[i] <= 0 || arr[i] > arr.length) {
                i++;
            } else if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
    }
}
