import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // arr[0] = 1;
        // arr[1] = 2;
        // arr[2] = 3;
        // arr[3] = 4;
        // arr[4] = 5;
        
        // int[] arr = new int[5];
        // for (int i = 0; i < arr.length; i++) {
        //     arr[i] = input.nextInt();
        // }
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.println(arr[i]);
        // }

        // for (int i : arr) {
        //     System.out.println(i);
        // }

        // System.out.println(Arrays.toString(arr));

        String[] str = new String[3];

        for (int i = 0; i < str.length; i++) {
            str[i] = input.next();
        }

        System.out.println(Arrays.toString(str));
    }
}
