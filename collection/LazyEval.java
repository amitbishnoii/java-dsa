import java.util.List;
import java.util.stream.Stream;

public class LazyEval {
    public static void main(String[] args) {
        List<String> stds = List.of("linklist", "boolean", "char", "defacement", "defacement", "enumeration");

        Stream<String> stream = stds.stream()
                .filter(x -> {
                    System.out.println("filtering: " + x);
                    return x.length() % 2 == 0;
                });

        System.out.println("before terminal ops");
        
        List<String> list = stream.toList();

        System.out.println(list);
    }
}
