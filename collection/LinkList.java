import java.util.LinkedList;

public class LinkList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        
        for (int i = 0; i < 21; i++) {
            list.add(i);
        }

        list.removeIf(x -> x % 3 == 0);
        System.out.println(list);
    }
}
