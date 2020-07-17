package example1;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Example1 {
    /*
        Consumer -> consumes value but doesn't return any value
        BiConsumer -> Consumer consuming two values
        Supplier
        Function
        BiFunction
        Predicate
        BiPredicate
        UnaryOperator
        BinaryOperator
     */
    public static void main(String[] args) {

        Consumer<String> c1 = s -> System.out.println(s);
        c1.accept("Hello!"); // Hello!

        BiConsumer<Integer, String> c2 = (a, b) -> System.out.println(a + " " + b);
        c2.accept(1, ":)");


    }

}
