import java.util.Arrays;

public class LeetCode_455 {
    public static void main(String[] args) {
        int[] g = { 10, 9, 8, 7 };
        int[] s = { 5, 6, 7, 8 };
        System.out.println(findContentChildren(g, s));
    }

    static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int answer = 0;
        int cookieIndex = 0;
        int childIndex = 0;
        int child = g.length;
        int cookie = s.length;

        while (childIndex < child && cookieIndex < cookie) {
            if (s[cookieIndex] >= g[childIndex]) {
                answer++;
                childIndex++;
                cookieIndex++;
            } 
            else {
                cookieIndex++;
            }
        }

        return answer;
    }
}
