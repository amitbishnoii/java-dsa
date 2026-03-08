public class MostWater {
    public static void main(String[] args) {
        int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        System.out.println(maxArea(height));
    }

    // brute force
    // static int maxArea(int[] height) {
    // int most = Integer.MIN_VALUE;
    // for (int i = 0; i < height.length; i++) {
    // for (int j = i + 1; j < height.length; j++) {
    // int smaller = (height[i] < height[j]) ? i : j;
    // int width = j - i;
    // if (width * height[smaller] > most) {
    // most = width * height[smaller];
    // }
    // }
    // }
    // return most;
    // }

    static int maxArea(int[] height) {
        int most = Integer.MIN_VALUE;
        int i = 0;
        int j = height.length - 1;
        while (i < j) {
            int length = (height[i] < height[j]) ? i : j;
            int breadth = j - i;
            most = Math.max(most, height[length] * breadth);
            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }

        return most;

    }
}