package examples;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Example10 {

    public static void main(String[] args) {

        List<String> list = List.of("AAA", "B", "CCCC", "DDD", "FFFFFF", "AAA");

        final Map<Integer, List<String>> map1 = list.stream()
                .collect(
                        Collectors.groupingBy(String::length));
        System.out.println(map1); // {1=[B], 3=[AAA, DDD, AAA], 4=[CCCC], 6=[FFFFFF]}

        final Map<Integer, String> map2 = list.stream()
                .collect(
                        Collectors.groupingBy(String::length,
                                Collectors.mapping(
                                        String::valueOf,
                                        Collectors.joining()
                                )));
        System.out.println(map2); // {1=B, 3=AAADDDAAA, 4=CCCC, 6=FFFFFF}
    }

}
