package optional;

import java.util.Optional;

public class Example4 {

    public static void main(String[] args) {

        final Optional<Integer> o1 = Optional.empty(); // empty box
        final Optional<Integer> o2 = Optional.of(10); // 10 is inside the box

        // map() x -> y
        // flatMap() x -> Optional(y)

        final Integer i1 = o2.map(x -> 2 * x).orElse(-1); // 20
        final Integer i2 = o2.flatMap(x -> Optional.of(2 * x)).orElse(-1); // 20

        final Integer i3 = o2.flatMap(Example4::twice).orElse(-1); // 20

    }

    private static Optional<Integer> twice(Integer x) {
        return Optional.of(2 * x);
    }
}
