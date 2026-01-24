import java.util.Scanner;

public class Temprature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the temp in celsius: ");
        float temp_c = input.nextFloat();
        float temp_f = (temp_c * 9/5) + 32;
        System.out.println("temprature in fahrenheit: " + temp_f);
    }
}
