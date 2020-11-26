package main;

import java.util.List;

public class Example6 {

    public static void main(String[] args) {

        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // peek only consumes, does not effect the stream unlike filter and its not a terminal operator
        list.stream()
                .peek(System.out::println) // log
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);

    }

}
