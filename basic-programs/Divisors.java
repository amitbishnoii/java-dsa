import java.util.ArrayList;

public class Divisors {
    public static void main(String[] args) {
        primeNum(100);
    }

    static void primeNum(int x) {
        ArrayList<Integer> factors = new ArrayList<>();
        for (int i = 1; i * i <= x; i++) {
            if (x % i == 0) {
                factors.add(i);
                if ((x / i) != i) {
                    factors.add(x / i);
                }
            }
        }
        factors.sort(null);
        System.out.println(factors);
    }
}
