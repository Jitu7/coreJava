package optional;

import java.util.Optional;
import java.util.function.Supplier;

public class Example3 {

    public static void main(String[] args) {

        final Optional<Integer> o1 = Optional.empty(); // empty box
        final Optional<Integer> o2 = Optional.of(10); // 10 is inside the box

        final Integer i1 = o1.orElse(-1); // -1
        final Integer i2 = o2.orElse(-1); // 10

        Supplier<Integer> s1 = () -> -1;
        final Integer i3 = o1.orElseGet(s1);

        final Integer i4 = o2.orElseThrow(() -> new RuntimeException("😐")); // 10

        final Integer i5 = o1.or(() -> o2).orElse(-1); // 10 Java 9

        o1.ifPresentOrElse(
                System.out::println,
                () -> System.out.println("There is no value"));
    }

    static Integer m() {
        return null;
    }

}
