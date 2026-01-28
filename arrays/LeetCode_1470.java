import java.util.Arrays;

public class LeetCode_1470 {
    public static void main(String[] args) {
        int[] arr = { 2, 5, 1, 3, 4, 7 };
        int n = 3;
        shuffle(arr, n);
        
    }

    static void shuffle(int[] array, int n) {
        int[] arr_2 = new int[n * 2];
        int index = 0;
        for (int i = 0; i < n; i++) {
            arr_2[index] = array[i];
            arr_2[index+1] = array[i+n];
            index+=2;
        }
        System.out.println(Arrays.toString(arr_2));
    }
}
