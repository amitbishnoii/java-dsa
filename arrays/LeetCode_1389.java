import java.util.ArrayList;

public class LeetCode_1389 {
    public static void main(String[] args) {
        int[] nums = { 0, 1, 2, 3, 4 };
        int[] index = { 0, 1, 2, 2, 1 };
        createArray(nums, index);
    }

    static void createArray(int[] nums, int[] index) {
        ArrayList<Integer> output = new ArrayList<>();

        for (int i = 0; i < index.length; i++) {
            output.add(index[i], nums[i]);
        }
        System.out.println(output);
    }
}
