public class LeetCode_240 {
    public static void main(String[] args) {
        int[][] matrix = {
                { -1, 3 },
        };
        int target = 3;
        System.out.println(searchMatrix(matrix, target));
    }

    static boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;
        int col = matrix[0].length - 1;

        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] < target) {
                row += 1;
            } else {
                col -= 1;
            }
        }
        return false;
    }
}
