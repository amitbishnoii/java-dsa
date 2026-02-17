package sorting;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 4, 1, 2 };
        System.out.println(Arrays.toString(bubble_sort(arr)));
    }

    static int[] bubble_sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
        return arr;
    }
 }
