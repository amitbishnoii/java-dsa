public class LeetCode_2024 {

    public static void main(String[] args) {
        String answerKey = "TTFF";
        int k = 2;
        System.out.println(maxConsecutiveAnswers(answerKey, k));
    }

    static int maxConsecutiveAnswers(String answerKey, int k) {
        int result = 0;
        int low = 0;
        int[] freq = new int[255];

        for (int high = 0; high < answerKey.length(); high++) {
            freq[answerKey.charAt(high)]++;
            int maxFreq = findMax(freq);
            int len = (high - low) + 1;

            while ((len - maxFreq) > k) {
                freq[answerKey.charAt(low)]--;
                low++;
                maxFreq = findMax(freq);
                len = (high - low) + 1;
            }

            result = Math.max(result, len);
        }
        return result;
    }

    static int findMax(int[] arr) {
        int element = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > element) {
                element = arr[i];
            }
        }
        return element;
    }
}
