import java.util.Arrays;

public class Hashing {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 1, 3, 2 };
        int[] hash = new int[10];

        for (int i = 0; i < arr.length; i++) {
            hash[arr[i]] += 1;
        }

        System.out.println(Arrays.toString(hash));
    }
}