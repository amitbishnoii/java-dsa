public class LeetCode_867 {
    public static void main(String[] args) {
        int[][] mat = {
                { 1, 2, 3 },
                { 4, 5, 6 },
        };
        transpose(mat);
    }

    static void transpose(int[][] mat) {
        int[][] trans = new int[mat[0].length][mat.length];
        for (int row = 0; row < mat.length; row++) {
            for (int col = 0; col < mat[row].length; col++) {
                trans[col][row] = mat[row][col];
            }
        }
        for (int row = 0; row < trans.length; row++) {
            for (int col = 0; col < trans[row].length; col++) {
                System.out.print(trans[row][col] + " ");
            }
            System.out.println();
        }
    }
}
