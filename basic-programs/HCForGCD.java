public class HCForGCD {
    public static void main(String[] args) {
        System.out.println(Hcf(12, 14));
    }

    static int Hcf(int num1, int num2) {
        // int min = num1 > num2 ? num2 : num1;
        // for (int i = 1; i <= min; i++) {
        // if (num1 % i == 0 && num2 % i == 0) {
        // hcf = i;
        // }
        // }
        while (num1 > 0 && num2 > 0) {
            if (num1 > num2) {
                num1 = num1 % num2;
            } else {
                num2 = num2 % num1;
            }
        }
        if (num1 == 0) {
            return num2;
        } else {
            return num1;
        }
    }
}
