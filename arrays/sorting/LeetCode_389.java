import java.util.Arrays;

public class LeetCode_389 {
    public static void main(String[] args) {
        String in1 = "ae";
        String in2 = "aea";
        System.out.println(findTheDifference(in1, in2));
    }

    static char findTheDifference(String s, String t) {
        if (s.length() == 0) return t.charAt(0);
        char[] s_arr = s.toCharArray();
        char[] t_arr = t.toCharArray();
        Arrays.sort(s_arr);
        Arrays.sort(t_arr);
        s = new String(s_arr);
        t = new String(t_arr);
        System.out.println(s);
        System.out.println(t);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != t.charAt(i)) {
                return t.charAt(i);
            }
        }
        return t.charAt(t.length() - 1);
    }
}
