public class Palindrome {
    public static void main(String[] args) {
        System.out.println(palindrome(151));
    }

    static boolean palindrome(int x) {
        int a = x;
        int rev = 0;
        while (x > 0) {
            int temp = x % 10;
            rev = (rev * 10) + temp;
            x = x / 10;
        }
        return rev == a;
    }
}
