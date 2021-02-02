package examples;

import java.util.List;
import java.util.stream.Collectors;

public class Example13 {

    public static void main(String[] args) {

        List<String> list = List.of("AAA", "B", "CCCC", "DDD", "FFFFFF", "AAA");

        final Double avg = list.stream()
                .collect(Collectors.averagingInt(s -> s.length()));

        System.out.println(avg);
    }

}
