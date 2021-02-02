package optional;

import java.util.Optional;

public class Example5 {

    public static void main(String[] args) {

        final Optional<Integer> o1 = Optional.empty(); // empty box
        final Optional<Integer> o2 = Optional.of(10); // 10 is inside the box

        o2.ifPresent(System.out::println); // SE8

        o2.ifPresentOrElse(
                System.out::println,
                () -> System.out.println("😞")); // SE9x
    }
}
