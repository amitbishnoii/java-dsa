import java.util.Arrays;

public class mergeSorted {
    public static void main(String[] args) {
        int[] arr1 = { 1, 3, 5 };
        int[] arr2 = { 2, 4, 6, 7 };
        System.out.println(Arrays.toString(merge(arr1, arr2)));
    }

    static int[] merge(int[] arr1, int[] arr2) {
        int[] answer = new int[arr1.length + arr2.length];
        int i = 0;
        int j = 0;
        int index = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                answer[index] = arr1[i];
                index++;
                i++;
            } else {
                answer[index] = arr2[j];
                index++;
                j++;
            }
        }

        while (i < arr1.length) {
            answer[index] = arr1[i];
            index++;
            i++;
        }
        while (j < arr2.length) {
            answer[index] = arr2[j];
            index++;
            j++;
        }
        return answer;
    }
}
