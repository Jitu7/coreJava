package examples;

import java.util.List;
import java.util.stream.Collectors;

public class Example8 {

    public static void main(String[] args) {

        List<String> list = List.of("AAA", "B", "CCCC", "DDD", "FFFFFF", "AAA");

        List<Integer> integers = list.stream()
                .collect(
                        Collectors.mapping(
                                s -> s.length(),
                                Collectors.filtering(
                                        integer -> integer % 2 == 0,
                                        Collectors.toList()
                                )
                        )
                );

        System.out.println(integers); // [4, 6]
    }

}
