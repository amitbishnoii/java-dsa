import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode_438 {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "cabwerqwetabc";
        System.out.println(findAnagrams(s2, s1));
    }

    static List<Integer> findAnagrams(String s2, String s1) {
        int[] freq = new int[26];
        List<Integer> list = new ArrayList<>();

        if(s1.length() > s2.length()) return Arrays.asList();

        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i) - 'a']++;
        }

        for (int i = 0; i < s1.length(); i++) {
            freq[s2.charAt(i) - 'a']--;
        }

        if (allZero(freq))
            list.add(0);

        int low = 0;
        int high = s1.length() - 1;

        while (high < s2.length()) {
            high++;
            low++;

            freq[s2.charAt(low - 1) - 'a']++;
            if (high == s2.length())
                break;
            freq[s2.charAt(high) - 'a']--;

            if (allZero(freq))
                list.add(low);
        }
        return list;
    }

    static boolean allZero(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
