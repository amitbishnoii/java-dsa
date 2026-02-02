public class LeetCode_1252 {
    public static void main(String[] args) {
        int m = 2;
        int n = 2;
        int[][] mat = new int[m][n];
        int[][] ind = {
                { 1, 1 },
                { 0, 0 }
        };
        int count = 0;

        for (int row = 0; row < ind.length; row++) {
            for (int col = 0; col < mat[row].length; col++) {
                mat[ind[row][0]][col] += 1;
            }
            for (int col = 0; col < mat.length; col++) {
                mat[col][ind[row][1]] += 1;
            }
        }

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] % 2 != 0) {
                    count += 1;
                }
            }
        }

        System.out.println(count);

    }
}
