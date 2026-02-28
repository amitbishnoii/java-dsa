import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArray {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);

        for (Integer integer : list) {
            System.out.println(integer);

            if (integer == 14) {
                list.add(16);
                System.out.println("added 16 while iterating");
            }
        }

        System.out.println("updated list: " + list);
    }
}
