import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();

        System.out.println("Printing Multiplication table using for loop.");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + num * i);
        }

        System.out.println("Printinng Table using While loop.");
        int i = 1;
        while (i <= 10) {
            System.out.println(num + " x " + i + " = " + num * i);
            i += 1;
        }

        System.out.println("Printinng Table using do-While loop.");
        int j = 1;
        do {
            System.out.println(num + " x " + j + " = " + num * j);
            j += 1;
        } while (j <= 10);
    }
}
