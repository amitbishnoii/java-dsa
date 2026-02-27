import java.util.ArrayList;
import java.util.List;

public class ListCollection {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        System.out.println(list.size());
        list.add(12);
        list.add(122);
        list.add(11);
        System.out.println(list);
        // System.out.println(list.get(1));
        // System.out.println(list.size());
        list.remove(2);
        // System.out.println(list);
        System.out.println(list.contains(112));
    }
}
