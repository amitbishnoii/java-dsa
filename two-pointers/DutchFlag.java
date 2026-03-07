import java.lang.reflect.Array;
import java.util.Arrays;

public class DutchFlag {
    public static void main(String[] args) {
        int[] nums = { 2, 0, 2, 1, 1, 0 };
        sortColors_tp(nums);
    }

    static void sortColors_tp(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[mid] == 0) {
                swap(nums, mid, low);
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else if (nums[mid] == 2) {
                swap(nums, mid, high);
                high--;
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    static void swap(int[] arr, int i1, int i2) {
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }

    static void sortColors(int[] nums) {
        int zero = 0;
        int one = 0;
        int two = 0;

        for (int i : nums) {
            if (i == 0) {
                zero += 1;
            }
            else if (i == 1) {
                one += 1;
            }
            else {
                two += 1;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (zero != 0) {
                nums[i] = 0;
                zero--;
            }
            else if (zero == 0 && one != 0) {
                nums[i] = 1;
                one--;
            }
            else if (zero == 0 && one == 0 && two != 0) {
                nums[i] = 2;
                two--;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
