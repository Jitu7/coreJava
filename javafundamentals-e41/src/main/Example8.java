package main;

import java.util.List;

public class Example8 {

    public static void main(String[] args) {

        List<Integer> list = List.of(1, 2, 3, 50, 70, 100, 130);

        list.stream()
                .takeWhile(n -> n <= 100) // takeWhile(predicate) this predicate is respected eqv to while(cond)
                .forEach(System.out::println);

        System.out.println("******************");

        list.stream()
                .dropWhile(n -> n <= 100)
                .forEach(System.out::println);

    }

}
