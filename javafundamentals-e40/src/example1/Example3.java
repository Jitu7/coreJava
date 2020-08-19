package example1;

import java.util.List;

public class Example3 {

    public static void main(String[] args) {

        List<String> list = List.of("abcd", "qwerty", "asdfg");

        //Stream
        // map() Stream -> Stream
        // mapToInt() Stream -> IntStream
        // mapToLong() Stream -> LongStream
        // mapToDouble() Stream -> DoubleStream

        // IntStream
        // map() IntStream -> IntStream
        // mapToLong() IntStream -> DoubleStream
        // mapToObject() IntStream -> Stream

        var x = list.stream()
                .mapToInt(String::length) // Stream -> IntStream
                .mapToObj(s -> s)
                .mapToInt(s -> s)
                .sum();

        System.out.println(x);
    }

}
