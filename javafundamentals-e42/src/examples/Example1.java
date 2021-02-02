package examples;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Example1 {

    public static void main(String[] args) {

        List<String> list = List.of("AAA", "B", "CCCC", "DDD", "FFFFFF");

        List<String> stringList = list.stream()
                .collect(Collectors.toList());

        Set<String> stringSet = list.stream()
                .collect(Collectors.toSet());

        // want to collect into a specific type of collection
        TreeSet<String> res3 = list.stream()
                .collect(Collectors.toCollection(TreeSet::new));





    }

}
