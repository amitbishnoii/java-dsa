public class LeetCode_1572 {
    public static void main(String[] args) {
        int[][] mat = {
                { 1, 1, 1, 1 },
                { 1, 1, 1, 1 },
                { 1, 1, 1, 1 }
        };
        sum_mat(mat);

    }

    static void sum_mat(int[][] mat) {
        int sum = 0;
        for (int row = 0; row < mat.length; row++) {
            for (int col = 0; col < mat[row].length; col++) {
                if (row == col || row + col == mat.length - 1) {
                    sum += mat[row][col];
                }
            }
        }
        System.out.println(sum);
    }
}
