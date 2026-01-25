public class QuestionsLinear {
    public static void main(String[] args) {
        String name = "avrit";
        char tar = 'i';
        System.out.println(char_search(name, tar));
        int[] arr = { 2, 3, 4, 5, 6 };
        System.out.println(search_range(arr, 1, arr.length - 1, 4));
    }

    static int char_search(String str, char target) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                return i;
            }
        }
        return -1;
    }

    static int search_range(int[] array, int ind1, int ind2, int target) {
        for (int index = ind1; index <= ind2; index++) {
            if (array[index] == target) {
                return index;
            }
        }
        return -1;
    }

    static int[] search_2d(int[][] array, int target) {
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                if (array[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
