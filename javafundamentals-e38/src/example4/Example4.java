package example4;

import java.util.function.Function;

/*
Function -> consumes a value and returns a value
 */
public class Example4 {

    public static void main(String[] args) {
        Function<String, Integer> f1 = s -> s.length();
        Integer x = f1.apply("Hello!");

        System.out.println(x);

    }

}
