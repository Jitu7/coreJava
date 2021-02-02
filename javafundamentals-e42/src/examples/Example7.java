package examples;

import java.util.List;
import java.util.stream.Collectors;

public class Example7 {

    public static void main(String[] args) {

        List<String> list = List.of("AAA", "B", "CCCC", "DDD", "FFFFFF", "AAA");

        List<Integer> integers = list.stream()
                .collect(
                        Collectors.mapping(
                                s -> s.length(), // string -> int
                                Collectors.toList() // downstreaming
                        )
                );

        System.out.println(integers); // [3, 1, 4, 3, 6, 3]
    }

}
