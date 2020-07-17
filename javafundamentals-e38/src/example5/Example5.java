package example5;

import java.util.function.BiFunction;

/*
BiFunction -> consumes 2 value and returns one
 */
public class Example5 {

    public static void main(String[] args) {
        BiFunction<Integer, Integer, String> f = (a, b) -> a + "" + b;
        String s = f.apply(1, 1);

        System.out.println(s);
    }

}
