import java.util.Arrays;

public class LeetCode_242 {
    public static void main(String[] args) {
        String name = "anagram";
        char[] chars = name.toCharArray();
        Arrays.sort(chars);
        String sorted = new String(chars);
        System.out.println(sorted);
    }

    static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        char[] chars = s.toCharArray();
        char[] chars2 = t.toCharArray();
        Arrays.sort(chars);
        Arrays.sort(chars2);
        String sorted = new String(chars);
        String sorted2 = new String(chars2);
        for (int i = 0; i < sorted.length(); i++) {
            if (sorted.charAt(i) != sorted2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
