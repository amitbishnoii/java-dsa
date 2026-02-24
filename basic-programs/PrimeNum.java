public class PrimeNum {
    public static void main(String[] args) {
        
    }

    static boolean prime(int num) {
        for (int i = 2; i * i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
