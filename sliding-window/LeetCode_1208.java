public class LeetCode_1208 {
    public static void main(String[] args) {
        String s = "abcd";
        String t = "bcdf";
        int maxCost = 3;
        System.out.println(equalSubstring(s, t, maxCost));
    }

    static int equalSubstring(String s, String t, int maxCost) {
        int result = 0;
        int low = 0;
        int currentCost = 0;

        for (int high = 0; high < s.length(); high++) {
            currentCost += Math.abs(t.charAt(high) - s.charAt(high));

            while (currentCost > maxCost) {
                currentCost -= Math.abs(t.charAt(low) - s.charAt(low));
                low++;
            }

            int len = (high - low) + 1;
            result = Math.max(result, len);
        }

        return result;
    }
}
