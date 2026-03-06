import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode_15 {
    public static void main(String[] args) {
        int[] nums = { -1, 0, 1, 2, -1, -4 };
        System.out.println(threeSum(nums));
    }

    static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        Arrays.sort(nums);

        for (int index = 0; index < nums.length - 2; index++) {
            if (index > 0 && nums[index] == nums[index - 1]) {
                continue;
            }
            int first = nums[index] * -1;
            int i = index + 1;
            int j = nums.length - 1;
            while (i < j) {
                if (nums[i] + nums[j] == first) {
                    answer.add(Arrays.asList(nums[i], nums[j], first * -1));
                    i++;
                    j--;
                    while (i < j && nums[i] == nums[i - 1]) {
                        i++;
                    }
                    while (i < j && nums[j] == nums[j + 1]) {
                        j--;
                    }
                } else if (nums[i] + nums[j] > first) {
                    j--;
                } else {
                    i++;
                }
            }
        }
        return answer;
    }
}
