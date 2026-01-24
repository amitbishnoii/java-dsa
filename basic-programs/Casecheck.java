import java.util.Scanner;

public class Casecheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an alphabet: ");
        char alpha = input.next().trim().charAt(0);
        
        if (alpha >= 'a' && alpha <= 'z') {
            System.out.println("Small Letter.");
        } else {
            System.out.println("Capital Letter.");
        }
    }
}
