public class LeetCode_1431 {
    public static void main(String[] args) {
        int[] candies = { 2, 3, 5, 1, 3 };
        int extraCandies = 3;
        maxCandies(candies, extraCandies);
    }

    static void maxCandies(int[] candies, int extraCandies) {
        boolean[] array2 = new boolean[candies.length];
        for (int i = 0; i < candies.length; i++) {
            int currentHighest = candies[i] + extraCandies;
            for (int j = 0; j < candies.length; j++) {
                if (currentHighest >= candies[j]) {
                    array2[i] = true;
                } else {
                    array2[i] = false;
                    break;
                }
            }
        }
        System.out.println(array2);
    }
}