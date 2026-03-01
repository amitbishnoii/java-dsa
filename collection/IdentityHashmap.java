import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;
import java.lang.Object;
public class IdentityHashmap {
    public static void main(String[] args) {
        // Map<String, Integer> map = new HashMap<>();
        Map<String, Integer> map = new IdentityHashMap<>();
        String s1 = new String("abcd");
        String s2 = new String("abcd");

        System.out.println(System.identityHashCode(s1)); // hashcode of memory address
        System.out.println(System.identityHashCode(s2)); // hashcode of memory address

        System.out.println(s1.hashCode()); // hashcode of content inside String("this content")
        System.out.println(s2.hashCode()); // hashCode of content inside String("this content")

        map.put(s1, 1);
        map.put(s2, 2);

        System.out.println(map);
    }
}
