package examples;

import java.util.List;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Example4 {

    public static void main(String[] args) {

        List<String> list = List.of("AAA", "B", "CCCC", "DDD", "FFFFFF", "AAA");

        TreeMap<String, Integer> map1 = list.stream()
                .collect(
                        Collectors.toMap(
                                s -> s,
                                s -> s.length(),
                                (a, b) -> a + b, // what to do in case of duplicate key, with out ds it will throw an exception
                                () -> new TreeMap<>() // if key is not Comparable provide Comparator inside the Constructor
                        )
                );

        System.out.println(map1);
    }

}
