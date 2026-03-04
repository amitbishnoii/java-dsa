public class LeetCode_80 {
    public static void main(String[] args) {
        int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        System.out.println(removeDuplicates(nums));
    }

    static int removeDuplicates(int[] arr) {
        int k = 2;
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] != arr[k - 2]) {
                arr[k] = arr[i];
                k++;
            }
        }
        return k;
    }
}
