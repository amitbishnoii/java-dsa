package arrays;

import java.util.ArrayList;

public class ArrayListP {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(12);
        list.add(34);
        list.add(35);
        list.add(33);
        list.add(65);
        list.add(32);

        
        // System.out.println(list.contains(3345));
        System.out.println(list);
        list.remove(0);
        list.set(0, 123);
        System.out.println(list);
        System.out.println(list.get(3));
    }
}
