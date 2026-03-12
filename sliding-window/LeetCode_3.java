import java.util.HashMap;

public class LeetCode_3 {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }

    static int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int low = 0;
        int result = 0;

        for (int high = 0; high < s.length(); high++) {
            map.put(s.charAt(high), map.getOrDefault(s.charAt(high), 0) + 1);
            int k = (high - low) + 1;
            if(map.size() == k) {
                result = Math.max(result, k);
            }
            while (map.size() < k) {
                map.put(s.charAt(low), map.getOrDefault(s.charAt(low), 0) - 1);
                if(map.get(s.charAt(low)) == 0) {
                    map.remove(s.charAt(low));
                }
                low++;
                k = (high - low) + 1;
            }
        }
        return result;
    }
}
