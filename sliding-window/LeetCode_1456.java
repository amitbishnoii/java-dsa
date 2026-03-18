public class LeetCode_1456 {
    public int maxVowels(String s, int k) {
        int result = 0;
        int low = 0;
        int high = k - 1;
        int count = 0;

        if(s.length() == 1 && helper(s.charAt(0))) return 1;

        for (int i = 0; i <= high; i++) {
            if (helper(s.charAt(i))) {
                count++;
            }
        }

        result = Math.max(result, count);

        while (high < s.length()) {
            low++;
            high++;
            if (helper(s.charAt(low - 1)))
                count--;
            if (high == s.length())
                break;
            if (helper(s.charAt(high)))
                count++;
            
            result = Math.max(result, count);
        }

        return result;
    }

    static boolean helper(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
