public class LeetCode_424 {
    public static void main(String[] args) {
        String s = "ABAB";
        int k = 2;
        System.out.println(characterReplacement(s, k));
    }

    static int characterReplacement(String s, int k) {
        int[] arr = new int[255];
        int low = 0;
        int result = -1;
        for(int high = 0; high < s.length(); high++) {
            arr[s.charAt(high)]++;
            int maxCount = findMax(arr);
            int len = (high - low) + 1;
            int diff = len - maxCount;

            while(diff > k) {
                arr[s.charAt(low)]--;
                low++;
                maxCount = findMax(arr);
                len = (high - low) + 1;
                diff = len - maxCount;
            }

            len = (high - low) + 1;
            result = Math.max(result, len);
        }

        return result;
    }

    static int findMax(int[] arr) {
        int max = 0;
        for(int i = 0; i < arr.length; i ++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
