public class CeilingNumber {
    public static void main(String[] args) {
        int[] arr = { 12, 14, 16, 18, 20 };

        int target = 16;

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                System.out.println("index is: " + mid + " and number is: " + arr[mid]);
                break;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

            if (start > end) {
                System.out.println("ceiling index is: " + start + " and number is: " + arr[start]);
            }
        }
    }
}
