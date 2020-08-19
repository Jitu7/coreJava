package example2;

import java.util.Collection;
import java.util.List;

public class Example1 {

    public static void main(String[] args) {

        // flatMap
        // flatMapToInt
        // flatMapToLong
        // flatMapToDouble
        List<List<Integer>> list = List.of(
                List.of(1, 2, 3, 4, 5),
                List.of(4, 5, 6),
                List.of(1, 3)
        );

        var sum = list.stream() // Stream<List<Integer>> [1, 2, 3, 4, 5], [4, 5, 6], [1, 3]
                .flatMap(q -> q.stream()) // Stream<Integers> [1, 2, 3, 4, 5, 4, 5, 6, 1, 3]
                .reduce(0, (a, b) -> a + b);

        System.out.println(sum);

    }

}
