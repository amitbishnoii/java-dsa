package arrays;

import java.util.Arrays;

public class ArrayQuestions {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        // swap(arr, 0, 4);
        // maxItem(arr);
        reverse(arr);

        // System.out.println(arr.length);
        // int nothing = arr[arr.length - 1];
        // System.out.println(nothing);
        // System.out.println(arr[arr.length]);
    }

    static void maxItem(int[] array) {
        int max = array[0];
        for (int i : array) {
            if (i > max) {
                max = i;
            }
        }
        System.out.println(max);
    }

    static void maxRange(int[] array, int index1, int index2) {
        int max = array[index1];
        for (int i = index1; i <= index2; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
    }

    static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
        System.out.println(Arrays.toString(array));
    }

    static void reverse(int[] array) {
        int start = 0;
        int end = array.length - 1;

        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start += 1;
            end -= 1;
        }

        System.out.println(Arrays.toString(array));
    }
}
