package examples;

import java.util.List;
import java.util.stream.Collectors;

public class Example12 {

    public static void main(String[] args) {

        List<String> list = List.of("AAA", "B", "CCCC", "DDD", "FFFFFF", "AAA");

        final Integer integer = list.stream()
                .collect(Collectors.mapping(s -> s.length(),
                        Collectors.summingInt(n -> n)));

        System.out.println(integer);
    }

}
