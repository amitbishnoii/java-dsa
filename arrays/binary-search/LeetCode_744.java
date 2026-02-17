public class LeetCode_744 {
    public static void main(String[] args) {
        char[] chars = { 'c', 'f', 'j' };
        char target = 'd';
        ceilingChar(chars, target);
    }

    static char ceilingChar(char[] chars, char target) {
        int start = 0;
        int end = chars.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (chars[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return chars[start % chars.length];
    }
}
