package example7;

import java.util.function.BiPredicate;

public class Example7 {

    public static void main(String[] args) {
        BiPredicate<String, Integer> p = (s, i) -> s.length() == i;

        boolean b = p.test("Hello", 5);
        System.out.println(b);
    }

}
