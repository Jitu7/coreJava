package examples;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Example9 {

    public static void main(String[] args) {

        List<String> list = List.of("AAA", "B", "CCCC", "DDD", "FFFFFF", "AAA");

        final Map<Boolean, List<String>> booleanListMap =
                list.stream()
                        .collect(Collectors.partitioningBy(s -> s.length() % 2 == 0));

        System.out.println(booleanListMap); // {false=[AAA, B, DDD, AAA], true=[CCCC, FFFFFF]}

        final Map<Boolean, Set<String>> booleanSetMap = list.stream()
                .collect(
                        Collectors.partitioningBy(s -> s.length() % 2 == 0,
                                Collectors.toSet()));

        System.out.println(booleanSetMap); // {false=[AAA, B, DDD], true=[FFFFFF, CCCC]}

        final Map<Boolean, String> booleanStringMap = list.stream()
                .collect(
                        Collectors.partitioningBy(s -> s.length() % 2 == 0,
                                Collectors.joining()));

        System.out.println(booleanStringMap); // {false=AAABDDDAAA, true=CCCCFFFFFF}

        final Map<Boolean, String> map4 = list.stream()
                .collect(
                        Collectors.partitioningBy(s -> s.length() % 2 == 0,
                                Collectors.mapping(
                                        s -> String.valueOf(s.length()),
                                        Collectors.joining()
                                )
                        )
                );

        System.out.println(map4); // {false=3133, true=46} 

    }

}
