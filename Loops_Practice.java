import java.util.Scanner;

public class Loops_Practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        // if (a > b) {
        //     if (a > c) {
        //         System.out.println(a + " is greatest.");
        //     } else {
        //         System.out.println(c + " is greatest.");
        //     }
        // } else if (b > a) {
        //     if (b > c) {
        //         System.out.println(b + " is greatest.");
        //     } else {
        //         System.out.println(c + " is greatest.");
        //     }
        // } else {
        //     System.out.println("All are equal.");
        // }

        int max = Math.max(a, Math.max(c, b));
        System.out.println(max);
    }
}
