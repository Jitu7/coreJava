package examples;

import java.util.List;
import java.util.stream.Collectors;

public class Example5 {

    public static void main(String[] args) {

        List<String> list = List.of("AAA", "B", "CCCC", "DDD", "FFFFFF", "AAA");

        String res1 = list.stream()
                .collect(Collectors.joining());

        System.out.println(res1);

        String res2 = list.stream()
                .collect(Collectors.joining(","));

        System.out.println(res2);

        String res3 = list.stream()
                .collect(Collectors.joining(",", "[","]")); // SE9

        System.out.println(res3);


    }

}
