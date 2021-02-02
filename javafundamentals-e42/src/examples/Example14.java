package examples;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Example14 {

    public static void main(String[] args) {

        List<String> list = List.of("AAA", "B", "CCCC", "DDD", "FFFFFF", "AAA");

        final long count = list.stream()
                .count();
        System.out.println(count);

        final int sum = list.stream()
                .mapToInt(String::length)
                .sum();
        System.out.println(sum);

        final OptionalDouble average = list.stream()
                .mapToInt(String::length)
                .average();

        final IntSummaryStatistics intSummaryStatistics = list.stream()
                .mapToInt(String::length)
                .summaryStatistics();
        System.out.println(intSummaryStatistics);

        final IntSummaryStatistics summaryStatistics = list.stream()
                .collect(Collectors.summarizingInt(String::length));
        System.out.println(summaryStatistics);
    }

}
