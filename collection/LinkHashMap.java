import java.util.LinkedHashMap;
import java.util.Map;

public class LinkHashMap {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>(11, 0.4f, true);

        map.put("apple", 10);
        map.put("watermelon", 12);
        map.put("banana", 13);

        map.get("apple");

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
