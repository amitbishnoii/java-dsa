import java.util.Collections;
import java.util.ArrayList;

public class LeetCode_4 {
    public static void main(String[] args) {
        int[] a1 = { 1, 3 };
        int[] a2 = { 2 };
        System.out.println(findMedianSortedArrays(a1, a2));        
    }

    static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double ans;
        ArrayList<Integer> result = new ArrayList<>();
        for (int nums : nums1)
            result.add(nums);
        for (int nums : nums2)
            result.add(nums);
        Collections.sort(result);
        int start = 0;
        int end = result.size() - 1;
        int mid = start + end / 2;
        if (result.size() % 2 == 0) {
            ans = (result.get(mid) + result.get(mid + 1)) / 2.0;
        } else {
            ans = result.get(mid);
        }
        return ans;
    }
}
