import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LeetCode_2824 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(-1, 1, 2, 3, 1);
        int target = 2;
        System.out.println(countPairs(nums, target));
    }

    static int countPairs(List<Integer> nums, int target) {
        Collections.sort(nums);
        int count = 0;
        int i = 0;
        int j = nums.size() - 1;
        while (i < j) {
            if(nums.get(i) + nums.get(j) < target) {
                count += j - i;
                i++;
            } else {
                j--;
            }
        }
        return count;
    }
}
