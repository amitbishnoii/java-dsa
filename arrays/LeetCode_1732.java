public class LeetCode_1732 {
    public static void main(String[] args) {
        int[] gain = { -4, -3, -2, -1, 4, 3, 2 };
        highest_altitude(gain);
    }

    static void highest_altitude(int[] gain) {
        int high = 0;
        for (int i = 1; i < gain.length; i++) {
            gain[i] = gain[i] + gain[i - 1];
        }
        for (int i = 0; i < gain.length; i++) {
            if (gain[i] > high) {
                high = gain[i];
            }
        }
        System.out.println(high);
    }
}