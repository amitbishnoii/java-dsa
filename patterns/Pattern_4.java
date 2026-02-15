public class Pattern_4 {
    /*
    12345
    1234
    123
    12
    1
     */
    public static void main(String[] args) {
        for (int i = 5; i > 0; i--) {
            int temp = 1;
            for (int j = i; j > 0; j--) {
                System.out.print(temp);
                temp += 1;
            }
            System.out.println();
        }
    }
}
