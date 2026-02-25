import java.util.Arrays;

public class Recursion {
    public static void main(String[] args) {
        // System.out.println("enter n: ");
        // Scanner input = new Scanner(System.in);
        // int n = input.nextInt();
        // sum(n, 0);
        // System.out.println(sum_functional(n));
        // System.out.println(factorial(n));
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println(Arrays.toString(reverseArray(arr, 0, arr.length - 1)));
    }

    static void printName(int n) {
        if (n == 0)
            return;
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

    static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    static int[] reverseArray(int[] arr, int start, int end) {
        if (start >= end) {
            return arr;
        }
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        return reverseArray(arr, start + 1, end - 1);
    }
}
