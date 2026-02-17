import java.util.Arrays;

// leetcode 74
public class BinarySearchMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 3, 5, 7 },
                { 10, 11, 16, 20 },
                { 23, 30, 34, 60 },
        };
        int target = 3;
        System.out.println(search(matrix, target));
        // System.out.println(matrix[matrix.length - 1][matrix[0].length - 1]);
    }

    static boolean search(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int low = 0;
        int high = (rows * cols) - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            int current_row = mid / cols;
            int current_col = mid % cols;

            if (matrix[current_row][current_col] == target) {
                return true;
            } else if (matrix[current_row][current_col] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;

    }
}
