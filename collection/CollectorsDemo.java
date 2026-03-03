import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsDemo {
    public static void main(String[] args) {
        List<String> stds = List.of("linklist", "boolean", "char", "defacement", "defacement", "enumeration");
        // List<String> str = stds.stream().filter(x -> x.length() % 2 == 0).collect(Collectors.toList());
        // System.out.println(str);

        List<Integer> ints = Arrays.asList(1, 1, 2, 3, 4, 4, 5, 6, 7, 7, 8);
        System.out.println(ints.stream().collect(Collectors.toSet()));

        System.out.println(stds.stream().map(String::toUpperCase).collect(Collectors.joining(", ")));

        System.out.println(stds.stream().collect(Collectors.groupingBy(x -> x.length())));
    }
}
