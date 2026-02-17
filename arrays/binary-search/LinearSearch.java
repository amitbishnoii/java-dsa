public class LinearSearch {
    public static void main(String[] args) {
        // System.out.println("hello world");
        int[] array = {1,2,3,4,5};
        System.out.println(search(array, 54));
    }

    static int search(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }
}