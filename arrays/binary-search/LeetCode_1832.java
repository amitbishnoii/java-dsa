
public class LeetCode_1832 {
    public static void main(String[] args) {
        char[] alphabets = {
                'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
                'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
        };
        String sentence = "leetcode";
        // String sentence = "thequickbrownfoxjumpsoveralazydog";
        boolean pangram = false;
        boolean temp = false;
        for (int i = 0; i < alphabets.length; i++) {
            for (int j = 0; j < sentence.length(); j++) {
                if (sentence.charAt(j) == alphabets[i]) {
                    temp = true;
                    break;
                }
            }
            if (!temp) {
                pangram = false;
                break;
            }
        }
        System.out.println(pangram);
    }
}
