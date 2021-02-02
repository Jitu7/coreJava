package examples;

import java.util.List;
import java.util.stream.Collectors;

public class Example6 {

    public static void main(String[] args) {

        List<String> list = List.of("AAA", "B", "CCCC", "DDD", "FFFFFF", "AAA");

        var res =
                list.stream()
                        .collect(
                                Collectors.teeing(
                                        Collectors.counting(), // Long (counting the elements)
                                        Collectors.joining(), // String
                                        (a, b) -> List.of(a, b) // do something with result from a and b
                                ));

        System.out.println(res); // [6, AAABCCCCDDDFFFFFFAAA]
    }

}
