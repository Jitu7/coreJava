package main;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example9 {

    public static void main(String[] args) {

        // collect() --> terminal operator // Collector

        List<Integer> integerList = Stream.of(1, 2, 3, 4, 5)
                .map(n -> n*n)
                .collect(Collectors.toList());

    }

}
