import java.util.HashMap;

public class longestSubstring {
    // https://www.geeksforgeeks.org/problems/longest-k-unique-characters-substring0853/1

    public static void main(String[] args) {
        String s = "aabacbebebe";
        int k = 3;
        System.out.println(longestKSubstr(s, k));
    }

    static int longestKSubstr(String s, int k) {
        HashMap<Character, Integer> charMap = new HashMap<>();
        int low = 0;
        int result = -1;
        for (int high = 0; high < s.length(); high++) {
            charMap.put(s.charAt(high), charMap.getOrDefault(s.charAt(high), 0) + 1);
            while (charMap.size() > k) {
                charMap.put(s.charAt(low), charMap.get(s.charAt(low)) - 1);
                if (charMap.get(s.charAt(low)) == 0) {
                    charMap.remove(s.charAt(low));
                }
                low++;
            }
            if (charMap.size() == k) {
                int len = (high - low) + 1;
                result = Math.max(result, len);
            }
        }

        return result;
    }
}
