package examples;

import java.util.List;
import java.util.stream.Collectors;

public class Example11 {

    public static void main(String[] args) {

        List<String> list = List.of("AAA", "B", "CCCC", "DDD", "FFFFFF", "AAA");

        final int res1 = list.stream()
                .mapToInt(String::length)
                .sum();

        System.out.println(res1);

        final Integer res2 = list.stream()
                .collect(Collectors.summingInt(s -> s.length()));
        System.out.println(res2);

        final Long res3 = list.stream()
                .collect(Collectors.summingLong(s -> s.length()));
        System.out.println(res3);
    }

}
