package example1;

import java.util.List;

public class Example1 {

    public static void main(String[] args) {

        List<Integer> list = List.of(1, 5, 6, 3, 8, 9);

        list.stream()
                .filter(x -> x % 2 == 0)
                .forEach(System.out::println);
    }

}
