import java.util.Arrays;

public class LeetCode_1929 {
    public static void main(String[] args) {
        int[] array = { 1, 2, 1 };
        concate(array);
    }
    
    static void concate(int[] array) {
        int[] output = new int[array.length * 2];
        for (int i = 0; i < array.length; i++) {
            output[i] = array[i];
            output[i + array.length] = array[i];
        }
        System.out.println(Arrays.toString(output));
    }
}
