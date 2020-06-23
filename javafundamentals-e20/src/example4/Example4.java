package example4;

import java.util.function.Function;

public class Example4 {

    public static void main(String[] args) {
        // x -> y encoding "ABCD" -> "DCBA"
        Reverse r1 = str -> new StringBuilder(str).reverse().toString();
        String y = r1.reverse("ABCD");
        System.out.println(y); // DCBA

        // Function
        Function<String, String> f1 = str -> new StringBuilder(str).reverse().toString();
        String y1 = f1.apply("ABCD");
        System.out.println(y1); // DCBA

        // Function, Predicate, Consumer, BiConsumer ...
    }

}
