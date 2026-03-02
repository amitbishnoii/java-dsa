import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class InterfacePractice {
    public static void main(String[] args) {
        MathOperation sumOp = (a, b) -> a + b;
        MathOperation subOp = (a, b) -> a - b;
        // System.out.println(sumOp.operate(2, 3));
        // System.out.println(subOp.operate(5, 3));

        Predicate<Integer> isEven = a -> a % 2 == 0;
        // System.out.println(isEven.test(6));

        Predicate<String> startWithA = str -> str.toLowerCase().startsWith("a");
        // System.out.println(startWithA.test("trew"));
        Predicate<String> endWithT = str -> str.toLowerCase().endsWith("t");
        // System.out.println(endWithT.test("navin"));
        // System.out.println(startWithA.and(endWithT).test("asdfasdf"));

        Function<Integer, Integer> func = a -> a * 2;
        // System.out.println(func.apply(2));
        Function<Integer, Integer> triple = a -> a * 3;
        // System.out.println(triple.apply(2));
        // System.out.println(func.andThen(triple).apply(2));

        Consumer<Integer> consumer = (x) -> System.out.println(x);
        // consumer.accept(12);

        List<Integer> list = Arrays.asList(1, 2, 3);
        Consumer<List<Integer>> consumer2 = (x) -> {
            for (int y : x) {
                System.out.println(y);
            }
        };
        // consumer2.accept(list);

        Supplier<String> supplier = () -> "hello world!";
        // System.out.println(supplier.get());

        List<String> students = Arrays.asList("ram", "shyam", "asdf");
        students.forEach(x -> System.out.println(x));
        students.forEach(System.out::println);
    }
}

interface MathOperation {
    int operate(int a, int b);
}
