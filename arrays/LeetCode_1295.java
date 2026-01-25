public class LeetCode_1295 {
    public static void main(String[] args) {
        int[] arr = { 121, 123, 124, 125, 1234 };

        // for (int i = 0; i < arr.length; i++) {
        // int d_count = 0;

        // }
        even_digits(arr);
    }

    static void even_digits(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int d_count = 0;
            while (arr[i] > 0) {
                d_count += 1;
                arr[i] = arr[i] / 10;
            }
            if (d_count % 2 == 0) {
                count += 1;
            }
        }

        System.out.println(count);
    }
}
