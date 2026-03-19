public class LeetCode_1052 {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int result = 0;
        int low = 0;
        int temp = 0;
        int maxWindow = 0;

        for (int high = 0; high < customers.length; high++) {
            if (grumpy[high] == 0) {
                result += customers[high];
            }

            int len = (high - low) + 1;

            if (grumpy[high] == 1) {
                temp += customers[high];
            }

            while (len > minutes) {
                if (grumpy[low] == 1) {
                    temp -= customers[low];
                }
                low++;
                len = (high - low) + 1;
            }
            maxWindow = Math.max(maxWindow, temp);
        }

        return result + maxWindow;
    }
}
