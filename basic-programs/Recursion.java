import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        System.out.println("enter n: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        printName(n);
    }

    static void printName(int n) {
        if (n == 0) return;
        System.out.println(n);
        n--;
        printName(n);
    }

    static void sum(int n) {

    }
}
