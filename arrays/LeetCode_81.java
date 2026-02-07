public class LeetCode_81 {
    public static boolean main(String[] args) {
        int[] array = { 1, 0, 1, 1, 1 };
        int target = 0;
        // the constraints of the questions are low you can apply linear search

        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return true;
            }
        }
        return false;
    }
}
