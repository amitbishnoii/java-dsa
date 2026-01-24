import java.util.Scanner;

public class Occurence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // System.out.println("Enter a number to check occurence in: ");
        // int number = input.nextInt();
        int number = 222;
        // System.out.println("Enter number to check occurence of: ");
        // int x = input.nextInt();
        int count = 0;
        while (number > 0) {
            int temp = number % 10;
            if (temp == 2) {
                System.out.println("Checking...");
                count++;
            }
            number = number / 10;
        }
        System.out.println(count);
    }
}
