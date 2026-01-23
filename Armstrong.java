public class Armstrong {
    public static void main(String[] args) {
        System.out.println(armstrong(153));        
    }

    static boolean armstrong(int num) {
        int sum = 0;
        int num2 = num;
        while (num > 0) {
            int temp = num % 10;
            int sq = temp * temp * temp;
            sum += sq;
            num = num / 10;
        }
        return sum == num2;
        
    }
}
