public class Pattern_7 {
    public static void main(String[] args) {
        char temp = 'A';
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(temp);
                System.out.print(" ");
            }
            temp += 1;
            System.out.println();
        }
    }
}
