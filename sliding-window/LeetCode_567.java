public class LeetCode_567 {
    public static void main(String[] args) {
        String s1 = "abcdefijkl";
        String s2 = "fe";
        System.out.println(checkInclusion(s1, s2));
    }

    static boolean checkInclusion(String s1, String s2) {
        int[] freq = new int[26];

        if(s1.length() > s2.length()) return false;

        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i) - 'a']++;
        }

        for (int i = 0; i < s1.length(); i++) {
            freq[s2.charAt(i) - 'a']--;
        }

        if (allZero(freq))
            return true;

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
                return true;
        }
        return false;
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