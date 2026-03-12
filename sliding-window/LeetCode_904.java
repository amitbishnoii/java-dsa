import java.util.HashMap;

public class LeetCode_904 {
    public static void main(String[] args) {
        int[] fruits = { 1, 2, 2 };
        System.out.println(totalFruit(fruits));
    }

    static int totalFruit(int[] fruits) {
        HashMap<Integer, Integer> fMap = new HashMap<>();
        int low = 0;
        int result = -1;

        for (int high = 0; high < fruits.length; high++) {
            fMap.put(fruits[high], fMap.getOrDefault(fruits[high], 0) + 1);
            while (fMap.size() > 2) {
                fMap.put(fruits[low], fMap.getOrDefault(fruits[low], 0) - 1);
                if (fMap.get(fruits[low]) == 0) {
                    fMap.remove(fruits[low]);
                }
                low++;
            }

            if (fMap.size() <= 2) {
                int len = (high - low) + 1;
                result = Math.max(result, len);
            }
        }

        return result;
    }
}