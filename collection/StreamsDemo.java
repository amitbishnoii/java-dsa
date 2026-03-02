import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsDemo {
    public static void main(String[] args) {
        // List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        // int count = 0;
        // for (int num : list) {
        // if (num % 2 == 0) {
        // count += 1;
        // }
        // }
        // System.out.println(count);
        // // methods to create streams
        // System.out.println(list.stream().filter(x -> x % 2 == 0).count());

        // String[] arr = {"a", "b", "c"};
        // Arrays.stream(arr);

        // Stream.of(arr);

        // // Stream.generate(() -> 1).limit(100);

        // List<Integer> s = Stream.iterate(1, x -> x +
        // 1).limit(100).collect(Collectors.toList());
        // System.out.println(s);

        // Intermediate Operations
        // 1. filter

        List<String> stds = List.of("linklist", "boolean", "char", "defacement", "defacement", "enumeration");
        List<Integer> stds2 = Stream.iterate(10, x -> x + 1).limit(100).toList();

        // long ans = stds.stream().filter(x -> x.length() % 2 == 0).count();
        // System.out.println(ans);

        // 2. map
        Stream<String> strs = stds.stream().map(x -> x.toUpperCase());

        // 3. sorted
        stds.stream().sorted();

        // 4. distinct
        stds.stream().distinct().count();

        // 5. limit
        stds.stream().filter(x -> x.length() > 1).limit(3).count();
        Stream.iterate(1, x -> x + 1).limit(100);

        // 6. collect
        stds.stream().toList();

        // 7. foreach
        // stds.stream().forEach(x -> System.out.println(x));

        // 8. reduce
        stds2.stream().filter(x -> x % 2 == 0).reduce((x, y) -> x + y).get();

        // 9. anyMatch, allMatch, noneMatch
        boolean bol = stds2.stream().anyMatch(x -> x >= 100);
        boolean bol2 = stds2.stream().allMatch(x -> x > 1);
        boolean bol3 = stds2.stream().noneMatch(x -> x > 101);
        // System.out.println(bol3);

        // 10. findFirst, findAny
        Optional<Integer> op = stds2.stream().findFirst();
        op.ifPresent(System.out::println);
    }
}
