import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        System.out.println("enter n: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        // sum(n, 0);
        System.out.println(sum_functional(n));
    }

    static void printName(int n) {
        if (n == 0) return;
        System.out.println(n);
        n--;
        printName(n);
    }

    static void sum(int n, int sum) {
        if (n < 1) {
            System.out.println(sum);
            return;
        }
        sum(n - 1, sum + n);
    }

    static int sum_functional(int n) {
        if (n < 1) {
            return 0;
        }
        return n + sum_functional(n - 1);
    }
}
